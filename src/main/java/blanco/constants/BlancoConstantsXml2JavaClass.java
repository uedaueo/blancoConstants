/*
 * blanco Framework
 * Copyright (C) 2004-2005 IGA Tosiki
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 */
package blanco.constants;

import java.io.File;
import java.io.IOException;

import blanco.cg.BlancoCgObjectFactory;
import blanco.cg.transformer.BlancoCgTransformerFactory;
import blanco.cg.valueobject.BlancoCgClass;
import blanco.cg.valueobject.BlancoCgField;
import blanco.cg.valueobject.BlancoCgSourceFile;
import blanco.commons.util.BlancoJavaSourceUtil;
import blanco.commons.util.BlancoNameUtil;
import blanco.commons.util.BlancoStringUtil;
import blanco.constants.message.BlancoConstantsMessage;
import blanco.constants.resourcebundle.BlancoConstantsResourceBundle;
import blanco.constants.valueobject.BlancoConstantsFieldStructure;
import blanco.constants.valueobject.BlancoConstantsStructure;

/**
 * 中間XMLファイルからJavaソースコードを自動生成するクラスです。
 *
 * 定数定義書(XLS)からソースコードを自動生成するプロジェクトの一部です。
 *
 * @author IGA Tosiki
 */
public class BlancoConstantsXml2JavaClass {
    /**
     * メッセージ。
     */
    private final BlancoConstantsMessage fMsg = new BlancoConstantsMessage();

    /**
     * リソースバンドルへのアクセサクラスのオブジェクト。
     */
    private final BlancoConstantsResourceBundle fBundle = new BlancoConstantsResourceBundle();

    /**
     * 内部的に利用するblancoCg用ファクトリ。
     */
    private BlancoCgObjectFactory fCgFactory = null;

    /**
     * 内部的に利用するblancoCg用ソースファイル情報。
     */
    private BlancoCgSourceFile fCgSourceFile = null;

    /**
     * 内部的に利用するblancoCg用クラス情報。
     */
    private BlancoCgClass fCgClass = null;

    /**
     * 自動生成するソースファイルの文字エンコーディング。
     */
    private String fEncoding = null;

    public void setEncoding(final String argEncoding) {
        fEncoding = argEncoding;
    }

    /**
     * ソースコード生成先ディレクトリのスタイル
     */
    private boolean fTargetStyleAdvanced = false;
    public void setTargetStyleAdvanced(boolean argTargetStyleAdvanced) {
        this.fTargetStyleAdvanced = argTargetStyleAdvanced;
    }
    public boolean isTargetStyleAdvanced() {
        return this.fTargetStyleAdvanced;
    }

    /**
     * 中間XMLファイルからJavaソースコードを自動生成します。
     *
     * @param argMetaXmlSourceFile
     *            ValueObjectに関するメタ情報が含まれているXMLファイル
     * @param argDirectoryTarget
     *            ソースコード生成先ディレクトリ
     * @throws IOException
     *             入出力例外が発生した場合
     */
    public void process(final File argMetaXmlSourceFile,
            final File argDirectoryTarget) throws IOException {
        final BlancoConstantsStructure[] structures = new BlancoConstantsXmlParser()
                .parse(argMetaXmlSourceFile);
        for (int index = 0; index < structures.length; index++) {
            // 得られた情報からJavaソースコードを生成します。
            structure2Source(structures[index], argDirectoryTarget);
        }
    }

    /**
     * 収集された情報を元に、Javaソースコードを出力します。
     *
     * @param processStructure
     *            処理構造
     * @param directoryTarget
     *            出力先フォルダ。
     */
    public void structure2Source(
            final BlancoConstantsStructure processStructure,
            final File directoryTarget) {

        /*
         * 出力ディレクトリはant taskのtargetStyel引数で
         * 指定された書式で出力されます。
         * 従来と互換性を保つために、指定がない場合は blanco/main
         * となります。
         * by tueda, 2019/08/30
         */
        String strTarget = directoryTarget
                .getAbsolutePath(); // advanced
        if (!this.isTargetStyleAdvanced()) {
            strTarget += "/main"; // legacy
        }
        final File fileBlancoMain = new File(strTarget);

        fCgFactory = BlancoCgObjectFactory.getInstance();
        fCgSourceFile = fCgFactory.createSourceFile(processStructure
                .getPackage(), null);
        fCgSourceFile.setEncoding(fEncoding);
        fCgClass = fCgFactory.createClass(processStructure.getName()
                + BlancoStringUtil.null2Blank(processStructure.getSuffix()),
                BlancoStringUtil.null2Blank(processStructure.getDescription()));
        fCgSourceFile.getClassList().add(fCgClass);

        // クラスのアクセスを設定。
        fCgClass.setAccess(processStructure.getAccess());
        // 抽象クラスかどうか。
        fCgClass.setAbstract(processStructure.getAbstract());

        // 継承
        if (BlancoStringUtil.null2Blank(processStructure.getExtends()).length() > 0) {
            fCgClass.getExtendClassList().add(
                    fCgFactory.createType(processStructure.getExtends()));
        }

        for (int indexField = 0; indexField < processStructure.getFieldList()
                .size(); indexField++) {
            BlancoConstantsFieldStructure fieldLook = (BlancoConstantsFieldStructure) processStructure
                    .getFieldList().get(indexField);
            final BlancoCgField field = fCgFactory.createField(fieldLook
                    .getName(), fieldLook.getType(), "");
            fCgClass.getFieldList().add(field);

            field.setAccess("public");
            field.setFinal(true);
            field.setStatic(true);

            if (fieldLook.getNo() != null) {
                field.getLangDoc().getDescriptionList().add(
                        fBundle.getXml2javaclassFieldNo(fieldLook.getNo()));
            }
            if (fieldLook.getDescription() != null) {
                field.getLangDoc().getDescriptionList().add(
                        fieldLook.getDescription());
            }

            if (processStructure.getAdjustConstValue() == false) {
                // そのまま代入します。
                field.setDefault(fieldLook.getValue());
            } else {
                // 型によってデフォルト値を書き分けます。
                // 対応しない型が与えられた場合には例外を発生します。
                if (fieldLook.getType().equals("java.lang.String")) {
                    field.setDefault("\""
                            + BlancoJavaSourceUtil
                                    .escapeStringAsJavaSource(fieldLook
                                            .getValue()) + "\"");
                } else if (fieldLook.getType().equals("boolean")
                        || fieldLook.getType().equals("short")
                        || fieldLook.getType().equals("int")
                        || fieldLook.getType().equals("long")) {
                    field.setDefault(fieldLook.getValue());
                } else if (fieldLook.getType().equals("java.lang.Boolean")
                        || fieldLook.getType().equals("java.lang.Integer")
                        || fieldLook.getType().equals("java.lang.Long")) {
                    field.setDefault("new "
                            + BlancoNameUtil.trimJavaPackage(fieldLook
                                    .getType()) + "(" + fieldLook.getValue()
                            + ")");
                } else if (fieldLook.getType().equals("java.lang.Short")) {
                    field.setDefault("new "
                            + BlancoNameUtil.trimJavaPackage(fieldLook
                                    .getType()) + "((short) "
                            + fieldLook.getValue() + ")");
                } else if (fieldLook.getType().equals("java.math.BigDecimal")) {
                    fCgSourceFile.getImportList().add("java.math.BigDecimal");
                    field.setDefault("new BigDecimal(\"" + fieldLook.getValue()
                            + "\")");
                } else if (fieldLook.getType().equals("java.util.ArrayList")) {
                    // ArrayListの場合には、与えられた文字をそのまま採用します。
                    fCgSourceFile.getImportList().add("java.util.ArrayList");
                    field.setDefault(fieldLook.getValue());
                } else {
                    throw new IllegalArgumentException(fMsg.getMbctji04(
                            processStructure.getName(), fieldLook.getName(),
                            fieldLook.getValue(), fieldLook.getType()));
                }
            }
        }

        BlancoCgTransformerFactory.getJavaSourceTransformer().transform(
                fCgSourceFile, fileBlancoMain);
    }
}
