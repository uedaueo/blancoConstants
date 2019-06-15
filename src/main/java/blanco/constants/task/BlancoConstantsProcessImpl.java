package blanco.constants.task;

import java.io.File;
import java.io.IOException;

import javax.xml.transform.TransformerException;

import blanco.constants.BlancoConstantsConstants;
import blanco.constants.BlancoConstantsMeta2Xml;
import blanco.constants.BlancoConstantsXml2JavaClass;
import blanco.constants.message.BlancoConstantsMessage;
import blanco.constants.task.valueobject.BlancoConstantsProcessInput;

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
                xml2java.process(fileMeta2[index], new File(input
                        .getTargetdir()));
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
