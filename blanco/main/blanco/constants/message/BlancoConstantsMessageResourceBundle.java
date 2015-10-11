/*
 * このソースコードは blanco Frameworkによって自動生成されています。
 * リソースバンドル定義書から作成されたリソースバンドルクラス。
 */
package blanco.constants.message;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * リソースバンドル定義[BlancoConstantsMessage/メッセージ定義[BlancoConstants]が内部的に利用するリソースバンドルクラス。]のリソースバンドルクラス。
 *
 * このクラスはリソースバンドル定義書から自動生成されたリソースバンドルクラスです。<BR>
 */
class BlancoConstantsMessageResourceBundle {
    /**
     * リソースバンドルオブジェクト。
     *
     * 内部的に実際に入力を行うリソースバンドルを記憶します。
     */
    private ResourceBundle fResourceBundle;

    /**
     * BlancoConstantsMessageResourceBundleクラスのコンストラクタ。
     *
     * 基底名[BlancoConstantsMessage]、デフォルトのロケール、呼び出し側のクラスローダを使用して、リソースバンドルを取得します。
     */
    public BlancoConstantsMessageResourceBundle() {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/constants/message/BlancoConstantsMessage");
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * BlancoConstantsMessageResourceBundleクラスのコンストラクタ。
     *
     * 基底名[BlancoConstantsMessage]、指定されたロケール、呼び出し側のクラスローダを使用して、リソースバンドルを取得します。
     *
     * @param locale ロケールの指定
     */
    public BlancoConstantsMessageResourceBundle(final Locale locale) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/constants/message/BlancoConstantsMessage", locale);
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * BlancoConstantsMessageResourceBundleクラスのコンストラクタ。
     *
     * 基底名[BlancoConstantsMessage]、指定されたロケール、指定されたクラスローダを使用して、リソースバンドルを取得します。
     *
     * @param locale ロケールの指定
     * @param loader クラスローダの指定
     */
    public BlancoConstantsMessageResourceBundle(final Locale locale, final ClassLoader loader) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/constants/message/BlancoConstantsMessage", locale, loader);
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * 内部的に保持しているリソースバンドルオブジェクトを取得します。
     *
     * @return 内部的に保持しているリソースバンドルオブジェクト。
     */
    public ResourceBundle getResourceBundle() {
        return fResourceBundle;
    }

    /**
     * bundle[BlancoConstantsMessage], key[MBCTJI01]
     *
     * [定数定義ID[{0}]のパッケージ名が指定されていません。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @return key[MBCTJI01]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getMbctji01(final String arg0) {
        // 初期値として定義書の値を利用します。
        String strFormat = "定数定義ID[{0}]のパッケージ名が指定されていません。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MBCTJI01");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // 与えられた引数を元に置換文字列を置き換えます。
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoConstantsMessage], key[MBCTJI02]
     *
     * [定数定義ID[{0}]のフィールド[{1}]の型が指定されていません。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @param arg1 置換文字列{1}を置換する値。java.lang.String型を与えてください。
     * @return key[MBCTJI02]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getMbctji02(final String arg0, final String arg1) {
        // 初期値として定義書の値を利用します。
        String strFormat = "定数定義ID[{0}]のフィールド[{1}]の型が指定されていません。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MBCTJI02");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // 与えられた引数を元に置換文字列を置き換えます。
        messageFormat.format(new Object[] {arg0, arg1}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoConstantsMessage], key[MBCTJI03]
     *
     * [定数定義ID[{0}]のフィールド[{1}]の値が指定されていません。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @param arg1 置換文字列{1}を置換する値。java.lang.String型を与えてください。
     * @return key[MBCTJI03]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getMbctji03(final String arg0, final String arg1) {
        // 初期値として定義書の値を利用します。
        String strFormat = "定数定義ID[{0}]のフィールド[{1}]の値が指定されていません。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MBCTJI03");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // 与えられた引数を元に置換文字列を置き換えます。
        messageFormat.format(new Object[] {arg0, arg1}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoConstantsMessage], key[MBCTJI04]
     *
     * [定数定義ID[{0}]のフィールド[{1}]の「値({2})」がセットされています。しかし「{3}」はサポートしません。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @param arg1 置換文字列{1}を置換する値。java.lang.String型を与えてください。
     * @param arg2 置換文字列{2}を置換する値。java.lang.String型を与えてください。
     * @param arg3 置換文字列{3}を置換する値。java.lang.String型を与えてください。
     * @return key[MBCTJI04]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getMbctji04(final String arg0, final String arg1, final String arg2, final String arg3) {
        // 初期値として定義書の値を利用します。
        String strFormat = "定数定義ID[{0}]のフィールド[{1}]の「値({2})」がセットされています。しかし「{3}」はサポートしません。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MBCTJI04");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // 与えられた引数を元に置換文字列を置き換えます。
        messageFormat.format(new Object[] {arg0, arg1, arg2, arg3}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoConstantsMessage], key[MBCTJA01]
     *
     * [メタディレクトリ[{0}]が存在しません。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @return key[MBCTJA01]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getMbctja01(final String arg0) {
        // 初期値として定義書の値を利用します。
        String strFormat = "メタディレクトリ[{0}]が存在しません。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MBCTJA01");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // 与えられた引数を元に置換文字列を置き換えます。
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }
}
