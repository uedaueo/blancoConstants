package blanco.constants.task;

import java.io.File;
import java.io.IOException;

import javax.xml.transform.TransformerException;

import blanco.constants.BlancoConstantsConstants;
import blanco.constants.BlancoConstantsMeta2Xml;
import blanco.constants.BlancoConstantsXml2JavaClass;
import blanco.constants.message.BlancoConstantsMessage;
import blanco.constants.task.valueobject.BlancoConstantsProcessInput;
import blanco.resourcebundle.BlancoResourceBundleConstants;

public class BlancoConstantsProcessImpl implements BlancoConstantsProcess {
    /**
     * メッセージ。
     */
    private final BlancoConstantsMessage fMsg = new BlancoConstantsMessage();

    public int execute(final BlancoConstantsProcessInput input)
            throws IOException, IllegalArgumentException {
        System.out.println("- " + BlancoConstantsConstants.PRODUCT_NAME + " ("
                + BlancoConstantsConstants.VERSION + ")");

        try {
            final File fileMetadir = new File(input.getMetadir());
            if (fileMetadir.exists() == false) {
                throw new IllegalArgumentException(fMsg.getMbctja01(input
                        .getMetadir()));
            }

            /*
             * 改行コードを決定します。
             */
            String LF = "\n";
            String CR = "\r";
            String CRLF = CR + LF;
            String lineSeparatorMark = input.getLineSeparator();
            String lineSeparator = "";
            if ("LF".equals(lineSeparatorMark)) {
                lineSeparator = LF;
            } else if ("CR".equals(lineSeparatorMark)) {
                lineSeparator = CR;
            } else if ("CRLF".equals(lineSeparatorMark)) {
                lineSeparator = CRLF;
            }
            if (lineSeparator.length() != 0) {
                System.setProperty("line.separator", lineSeparator);
                if (input.getVerbose()) {
                    System.out.println("lineSeparator try to change to " + lineSeparatorMark);
                    String newProp = System.getProperty("line.separator");
                    String newMark = "other";
                    if (LF.equals(newProp)) {
                        newMark = "LF";
                    } else if (CR.equals(newProp)) {
                        newMark = "CR";
                    } else if (CRLF.equals(newProp)) {
                        newMark = "CRLF";
                    }
                    System.out.println("New System Props = " + newMark);
                }
            }

            /*
             * targetdir, targetStyleの処理。
             * 生成されたコードの保管場所を設定する。
             * targetstyle = blanco:
             *  targetdirの下に main ディレクトリを作成
             * targetstyle = maven:
             *  targetdirの下に main/java ディレクトリを作成
             * targetstyle = free:
             *  targetdirをそのまま使用してディレクトリを作成。
             *  ただしtargetdirがからの場合はデフォルト文字列(blanco)使用する。
             * by tueda, 2019/08/30
             */
            String strTarget = input.getTargetdir();
            String style = input.getTargetStyle();
            // ここを通ったら常にtrue
            boolean isTargetStyleAdvanced = true;
            if (style != null && BlancoConstantsConstants.TARGET_STYLE_MAVEN.equals(style)) {
                strTarget = strTarget + "/" + BlancoConstantsConstants.TARGET_DIR_SUFFIX_MAVEN;
            } else if (style == null ||
                    !BlancoConstantsConstants.TARGET_STYLE_FREE.equals(style)) {
                strTarget = strTarget + "/" + BlancoConstantsConstants.TARGET_DIR_SUFFIX_BLANCO;
            }
            /* style が free だったらtargetdirをそのまま使う */
            if (input.getVerbose()) {
                System.out.println("TARGETDIR = " + strTarget);
            }

            // テンポラリディレクトリを作成。
            new File(input.getTmpdir()
                    + BlancoConstantsConstants.TARGET_SUBDIRECTORY).mkdirs();

            // 指定されたメタディレクトリを処理します。
            new BlancoConstantsMeta2Xml().processDirectory(fileMetadir, input
                    .getTmpdir()
                    + BlancoConstantsConstants.TARGET_SUBDIRECTORY);

            // XML化されたメタファイルからValueObjectを生成
            // 最初にテンポラリフォルダを走査
            final File[] fileMeta2 = new File(input.getTmpdir()
                    + BlancoConstantsConstants.TARGET_SUBDIRECTORY).listFiles();
            for (int index = 0; index < fileMeta2.length; index++) {
                if (fileMeta2[index].getName().endsWith(".xml") == false) {
                    continue;
                }

                final BlancoConstantsXml2JavaClass xml2java = new BlancoConstantsXml2JavaClass();
                xml2java.setEncoding(input.getEncoding());
                xml2java.setTargetStyleAdvanced(isTargetStyleAdvanced);
                xml2java.process(fileMeta2[index], new File(strTarget));
            }

            return BlancoConstantsBatchProcess.END_SUCCESS;
        } catch (TransformerException e) {
            throw new IOException("XML変換の過程で例外が発生しました: " + e.toString());
        }
    }

    /**
     * {@inheritDoc}
     */
    public boolean progress(final String argProgressMessage) {
        System.out.println(argProgressMessage);
        return false;
    }
}
