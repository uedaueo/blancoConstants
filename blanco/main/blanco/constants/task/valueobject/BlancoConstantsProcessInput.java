/*
 * このソースコードは blanco Frameworkにより自動生成されました。
 */
package blanco.constants.task.valueobject;

/**
 * 処理クラス [BlancoConstantsProcess]の入力バリューオブジェクトクラスです。
 */
public class BlancoConstantsProcessInput {
    /**
     * フィールド [verbose]
     *
     * 項目の型 [boolean]<br>
     * 規定値   [false]<br>
     * verboseモードで動作させるかどうか。
     */
    private boolean fVerbose = false;

    /**
     * フィールド [metadir]
     *
     * 項目の型 [java.lang.String]<br>
     * メタディレクトリ。xlsファイルの格納先または xmlファイルの格納先を指定します。
     */
    private String fMetadir;

    /**
     * フィールド [targetdir]
     *
     * 項目の型 [java.lang.String]<br>
     * 規定値   [blanco]<br>
     * 出力先フォルダを指定します。無指定の場合にはカレント直下のblancoを用います。
     */
    private String fTargetdir = "blanco";

    /**
     * フィールド [tmpdir]
     *
     * 項目の型 [java.lang.String]<br>
     * 規定値   [tmp]<br>
     * テンポラリディレクトリを指定します。無指定の場合にはカレント直下のtmpを用います。
     */
    private String fTmpdir = "tmp";

    /**
     * フィールド [encoding]
     *
     * 項目の型 [java.lang.String]<br>
     * 自動生成するソースファイルの文字エンコーディングを指定します。
     */
    private String fEncoding;

    /**
     * フィールド [verbose]のセッターメソッド
     *
     * 項目の型 [boolean]<br>
     * verboseモードで動作させるかどうか。
     *
     * @param argVerbose フィールド[verbose]に格納したい値
     */
    public void setVerbose(final boolean argVerbose) {
        fVerbose = argVerbose;
    }

    /**
     * フィールド[verbose]のゲッターメソッド
     *
     * 項目の型 [boolean]<br>
     * 規定値   [false]<br>
     * verboseモードで動作させるかどうか。
     *
     * @return フィールド[verbose]に格納されている値
     */
    public boolean getVerbose() {
        return fVerbose;
    }

    /**
     * フィールド [metadir]のセッターメソッド
     *
     * 項目の型 [java.lang.String]<br>
     * メタディレクトリ。xlsファイルの格納先または xmlファイルの格納先を指定します。
     *
     * @param argMetadir フィールド[metadir]に格納したい値
     */
    public void setMetadir(final String argMetadir) {
        fMetadir = argMetadir;
    }

    /**
     * フィールド[metadir]のゲッターメソッド
     *
     * 項目の型 [java.lang.String]<br>
     * メタディレクトリ。xlsファイルの格納先または xmlファイルの格納先を指定します。
     *
     * @return フィールド[metadir]に格納されている値
     */
    public String getMetadir() {
        return fMetadir;
    }

    /**
     * フィールド [targetdir]のセッターメソッド
     *
     * 項目の型 [java.lang.String]<br>
     * 出力先フォルダを指定します。無指定の場合にはカレント直下のblancoを用います。
     *
     * @param argTargetdir フィールド[targetdir]に格納したい値
     */
    public void setTargetdir(final String argTargetdir) {
        fTargetdir = argTargetdir;
    }

    /**
     * フィールド[targetdir]のゲッターメソッド
     *
     * 項目の型 [java.lang.String]<br>
     * 規定値   [blanco]<br>
     * 出力先フォルダを指定します。無指定の場合にはカレント直下のblancoを用います。
     *
     * @return フィールド[targetdir]に格納されている値
     */
    public String getTargetdir() {
        return fTargetdir;
    }

    /**
     * フィールド [tmpdir]のセッターメソッド
     *
     * 項目の型 [java.lang.String]<br>
     * テンポラリディレクトリを指定します。無指定の場合にはカレント直下のtmpを用います。
     *
     * @param argTmpdir フィールド[tmpdir]に格納したい値
     */
    public void setTmpdir(final String argTmpdir) {
        fTmpdir = argTmpdir;
    }

    /**
     * フィールド[tmpdir]のゲッターメソッド
     *
     * 項目の型 [java.lang.String]<br>
     * 規定値   [tmp]<br>
     * テンポラリディレクトリを指定します。無指定の場合にはカレント直下のtmpを用います。
     *
     * @return フィールド[tmpdir]に格納されている値
     */
    public String getTmpdir() {
        return fTmpdir;
    }

    /**
     * フィールド [encoding]のセッターメソッド
     *
     * 項目の型 [java.lang.String]<br>
     * 自動生成するソースファイルの文字エンコーディングを指定します。
     *
     * @param argEncoding フィールド[encoding]に格納したい値
     */
    public void setEncoding(final String argEncoding) {
        fEncoding = argEncoding;
    }

    /**
     * フィールド[encoding]のゲッターメソッド
     *
     * 項目の型 [java.lang.String]<br>
     * 自動生成するソースファイルの文字エンコーディングを指定します。
     *
     * @return フィールド[encoding]に格納されている値
     */
    public String getEncoding() {
        return fEncoding;
    }

    /**
     * このバリューオブジェクトの文字列表現を取得します。
     *
     * オブジェクトのシャロー範囲でしかtoStringされない点に注意して利用してください。
     *
     * @return バリューオブジェクトの文字列表現。
     */
    public String toString() {
        final StringBuffer buf = new StringBuffer();
        buf.append("blanco.constants.task.valueobject.BlancoConstantsProcessInput[");
        buf.append("verbose=" + fVerbose);
        buf.append(",metadir=" + fMetadir);
        buf.append(",targetdir=" + fTargetdir);
        buf.append(",tmpdir=" + fTmpdir);
        buf.append(",encoding=" + fEncoding);
        buf.append("]");
        return buf.toString();
    }
}
