/*
 * blanco Framework
 * Copyright (C) 2004-2007 IGA Tosiki
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 */
package blanco.constants;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import blanco.commons.util.BlancoStringUtil;
import blanco.constants.message.BlancoConstantsMessage;
import blanco.constants.valueobject.BlancoConstantsFieldStructure;
import blanco.constants.valueobject.BlancoConstantsStructure;
import blanco.xml.bind.BlancoXmlBindingUtil;
import blanco.xml.bind.BlancoXmlUnmarshaller;
import blanco.xml.bind.valueobject.BlancoXmlDocument;
import blanco.xml.bind.valueobject.BlancoXmlElement;

/**
 * blancoConstantsの 中間XMLファイル形式をパース(読み書き)するクラス。
 * 
 * @author IGA Tosiki
 */
public class BlancoConstantsXmlParser {
    /**
     * メッセージ。
     */
    private final BlancoConstantsMessage fMsg = new BlancoConstantsMessage();

    /**
     * 中間XMLファイルのXMLドキュメントをパースして、バリューオブジェクト情報の配列を取得します。
     * 
     * @param argMetaXmlSourceFile
     *            中間XMLファイル。
     * @return パースの結果得られたバリューオブジェクト情報の配列。
     */
    public BlancoConstantsStructure[] parse(final File argMetaXmlSourceFile) {
        final BlancoXmlDocument documentMeta = new BlancoXmlUnmarshaller()
                .unmarshal(argMetaXmlSourceFile);
        if (documentMeta == null) {
            return null;
        }

        return parse(documentMeta);

    }

    /**
     * 中間XMLファイル形式のXMLドキュメントをパースして、バリューオブジェクト情報の配列を取得します。
     * 
     * @param argXmlDocument
     *            中間XMLファイルのXMLドキュメント。
     * @return パースの結果得られたバリューオブジェクト情報の配列。
     */
    public BlancoConstantsStructure[] parse(
            final BlancoXmlDocument argXmlDocument) {
        final List<BlancoConstantsStructure> listStructure = new ArrayList<BlancoConstantsStructure>();

        // ルートエレメントを取得します。
        final BlancoXmlElement elementRoot = BlancoXmlBindingUtil
                .getDocumentElement(argXmlDocument);
        if (elementRoot == null) {
            // ルートエレメントが無い場合には処理中断します。
            return null;
        }

        // sheet(Excelシート)のリストを取得します。
        final List<blanco.xml.bind.valueobject.BlancoXmlElement> listSheet = BlancoXmlBindingUtil
                .getElementsByTagName(elementRoot, "sheet");

        final int sizeListSheet = listSheet.size();
        for (int index = 0; index < sizeListSheet; index++) {
            final BlancoXmlElement elementSheet = listSheet.get(index);

            final BlancoConstantsStructure objClassStructure = parseElementSheet(elementSheet);
            if (objClassStructure != null) {
                // 得られた情報を記憶します。
                listStructure.add(objClassStructure);
            }
        }

        final BlancoConstantsStructure[] result = new BlancoConstantsStructure[listStructure
                .size()];
        listStructure.toArray(result);
        return result;
    }

    /**
     * 中間XMLファイル形式の「sheet」XMLエレメントをパースして、バリューオブジェクト情報を取得します。
     * 
     * @param argElementSheet
     *            中間XMLファイルの「sheet」XMLエレメント。
     * @return パースの結果得られたバリューオブジェクト情報。「name」が見つからなかった場合には nullを戻します。
     */
    public BlancoConstantsStructure parseElementSheet(
            final BlancoXmlElement argElementSheet) {
        final BlancoConstantsStructure objClassStructure = new BlancoConstantsStructure();
        final List<blanco.xml.bind.valueobject.BlancoXmlElement> listCommon = BlancoXmlBindingUtil
                .getElementsByTagName(argElementSheet, "blancoconstants-common");
        if (listCommon == null || listCommon.size() == 0) {
            // commonが無い場合にはスキップします。
            return null;
        }
        final BlancoXmlElement elementCommon = listCommon.get(0);
        objClassStructure.setName(BlancoXmlBindingUtil.getTextContent(
                elementCommon, "name"));
        objClassStructure.setPackage(BlancoXmlBindingUtil.getTextContent(
                elementCommon, "package"));
        objClassStructure.setDescription(BlancoXmlBindingUtil.getTextContent(
                elementCommon, "description"));
        objClassStructure.setSuffix(BlancoXmlBindingUtil.getTextContent(
                elementCommon, "suffix"));
        objClassStructure.setAccess(BlancoXmlBindingUtil.getTextContent(
                elementCommon, "access"));
        objClassStructure.setAbstract("true".equals(BlancoXmlBindingUtil
                .getTextContent(elementCommon, "abstract")));
        objClassStructure.setAdjustConstValue("true"
                .equals(BlancoXmlBindingUtil.getTextContent(elementCommon,
                        "adjustConstValue")));
        objClassStructure
                .setFieldList(new ArrayList<blanco.constants.valueobject.BlancoConstantsFieldStructure>());

        if (BlancoStringUtil.null2Blank(objClassStructure.getName()).trim()
                .length() == 0) {
            // 名前が無いものはスキップします。
            return null;
        }

        if (objClassStructure.getPackage() == null) {
            throw new IllegalArgumentException(fMsg
                    .getMbctji01(objClassStructure.getName()));
        }

        final List<blanco.xml.bind.valueobject.BlancoXmlElement> extendsList = BlancoXmlBindingUtil
                .getElementsByTagName(argElementSheet,
                        "blancoconstants-extends");
        if (extendsList != null && extendsList.size() != 0) {
            final BlancoXmlElement elementExtendsRoot = extendsList.get(0);
            objClassStructure.setExtends(BlancoXmlBindingUtil.getTextContent(
                    elementExtendsRoot, "name"));
        }

        final List<blanco.xml.bind.valueobject.BlancoXmlElement> listList = BlancoXmlBindingUtil
                .getElementsByTagName(argElementSheet, "blancoconstants-list");
        if (listList != null && listList.size() != 0) {
            final BlancoXmlElement elementListRoot = (BlancoXmlElement) listList
                    .get(0);
            final List<blanco.xml.bind.valueobject.BlancoXmlElement> listChildNodes = BlancoXmlBindingUtil
                    .getElementsByTagName(elementListRoot, "field");
            for (int index = 0; index < listChildNodes.size(); index++) {
                if (listChildNodes.get(index) instanceof BlancoXmlElement == false) {
                    continue;
                }
                final BlancoXmlElement elementList = (BlancoXmlElement) listChildNodes
                        .get(index);
                final BlancoConstantsFieldStructure fieldStructure = new BlancoConstantsFieldStructure();

                fieldStructure.setNo(BlancoXmlBindingUtil.getTextContent(
                        elementList, "no"));
                fieldStructure.setName(BlancoXmlBindingUtil.getTextContent(
                        elementList, "name"));
                if (fieldStructure.getName() == null
                        || fieldStructure.getName().trim().length() == 0) {
                    continue;
                }

                fieldStructure.setType(BlancoXmlBindingUtil.getTextContent(
                        elementList, "type"));
                fieldStructure.setValue(BlancoXmlBindingUtil.getTextContent(
                        elementList, "value"));
                fieldStructure.setDescription(BlancoXmlBindingUtil
                        .getTextContent(elementList, "description"));

                if (fieldStructure.getType() == null
                        || fieldStructure.getType().trim().length() == 0) {
                    throw new IllegalArgumentException(fMsg.getMbctji02(
                            objClassStructure.getName(), fieldStructure
                                    .getName()));
                }

                if (fieldStructure.getValue() == null
                        || fieldStructure.getValue().trim().length() == 0) {
                    throw new IllegalArgumentException(fMsg.getMbctji03(
                            objClassStructure.getName(), fieldStructure
                                    .getName()));
                }

                objClassStructure.getFieldList().add(fieldStructure);
            }
        }

        return objClassStructure;
    }
}
