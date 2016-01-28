/*
 * このソースコードは blanco Frameworkにより自動生成されました。
 */
package blanco.constants.valueobject;

/**
 * BlancoConstantsのなかで利用されるValueObjectです。
 */
public class BlancoConstantsFieldStructure {
    /**
     * フィールド [no]
     *
     * 項目の型 [java.lang.String]<br>
     * 項目番号
     */
    private String fNo;

    /**
     * フィールド [name]
     *
     * 項目の型 [java.lang.String]<br>
     * フィールド名を指定します。必須項目です。
     */
    private String fName;

    /**
     * フィールド [type]
     *
     * 項目の型 [java.lang.String]<br>
     * 型名をパッケージ名のフル修飾付で指定します。必須項目です。
     */
    private String fType;

    /**
     * フィールド [value]
     *
     * 項目の型 [java.lang.String]<br>
     * 値を指定します。
     */
    private String fValue;

    /**
     * フィールド [description]
     *
     * 項目の型 [java.lang.String]<br>
     * フィールドのJavaDocを指定します。
     */
    private String fDescription;

    /**
     * フィールド [no]のセッターメソッド
     *
     * 項目の型 [java.lang.String]<br>
     * 項目番号
     *
     * @param argNo フィールド[no]に格納したい値
     */
    public void setNo(final String argNo) {
        fNo = argNo;
    }

    /**
     * フィールド[no]のゲッターメソッド
     *
     * 項目の型 [java.lang.String]<br>
     * 項目番号
     *
     * @return フィールド[no]に格納されている値
     */
    public String getNo() {
        return fNo;
    }

    /**
     * フィールド [name]のセッターメソッド
     *
     * 項目の型 [java.lang.String]<br>
     * フィールド名を指定します。必須項目です。
     *
     * @param argName フィールド[name]に格納したい値
     */
    public void setName(final String argName) {
        fName = argName;
    }

    /**
     * フィールド[name]のゲッターメソッド
     *
     * 項目の型 [java.lang.String]<br>
     * フィールド名を指定します。必須項目です。
     *
     * @return フィールド[name]に格納されている値
     */
    public String getName() {
        return fName;
    }

    /**
     * フィールド [type]のセッターメソッド
     *
     * 項目の型 [java.lang.String]<br>
     * 型名をパッケージ名のフル修飾付で指定します。必須項目です。
     *
     * @param argType フィールド[type]に格納したい値
     */
    public void setType(final String argType) {
        fType = argType;
    }

    /**
     * フィールド[type]のゲッターメソッド
     *
     * 項目の型 [java.lang.String]<br>
     * 型名をパッケージ名のフル修飾付で指定します。必須項目です。
     *
     * @return フィールド[type]に格納されている値
     */
    public String getType() {
        return fType;
    }

    /**
     * フィールド [value]のセッターメソッド
     *
     * 項目の型 [java.lang.String]<br>
     * 値を指定します。
     *
     * @param argValue フィールド[value]に格納したい値
     */
    public void setValue(final String argValue) {
        fValue = argValue;
    }

    /**
     * フィールド[value]のゲッターメソッド
     *
     * 項目の型 [java.lang.String]<br>
     * 値を指定します。
     *
     * @return フィールド[value]に格納されている値
     */
    public String getValue() {
        return fValue;
    }

    /**
     * フィールド [description]のセッターメソッド
     *
     * 項目の型 [java.lang.String]<br>
     * フィールドのJavaDocを指定します。
     *
     * @param argDescription フィールド[description]に格納したい値
     */
    public void setDescription(final String argDescription) {
        fDescription = argDescription;
    }

    /**
     * フィールド[description]のゲッターメソッド
     *
     * 項目の型 [java.lang.String]<br>
     * フィールドのJavaDocを指定します。
     *
     * @return フィールド[description]に格納されている値
     */
    public String getDescription() {
        return fDescription;
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
        buf.append("blanco.constants.valueobject.BlancoConstantsFieldStructure[");
        buf.append("no=" + fNo);
        buf.append(",name=" + fName);
        buf.append(",type=" + fType);
        buf.append(",value=" + fValue);
        buf.append(",description=" + fDescription);
        buf.append("]");
        return buf.toString();
    }
}
