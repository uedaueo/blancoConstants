/*
 * このソースコードは blanco Frameworkにより自動生成されました。
 */
package blanco.constants.valueobject;

import java.util.List;

/**
 * BlancoConstantsのなかで利用されるValueObjectです。
 */
public class BlancoConstantsStructure {
    /**
     * フィールド [name]
     *
     * 項目の型 [java.lang.String]<br>
     * フィールド名を指定します。必須項目です。
     */
    private String fName;

    /**
     * フィールド [package]
     *
     * 項目の型 [java.lang.String]<br>
     * パッケージ名を指定します。必須項目です。
     */
    private String fPackage;

    /**
     * フィールド [description]
     *
     * 項目の型 [java.lang.String]<br>
     * このバリューオブジェクトの説明を記載します。
     */
    private String fDescription;

    /**
     * フィールド [suffix]
     *
     * 項目の型 [java.lang.String]<br>
     * クラス名のサフィックスを指定します。
     */
    private String fSuffix;

    /**
     * フィールド [access]
     *
     * 項目の型 [java.lang.String]<br>
     * 規定値   ["public"]<br>
     * クラスのアクセス。通常は public。
     */
    private String fAccess = "public";

    /**
     * フィールド [abstract]
     *
     * 項目の型 [boolean]<br>
     * 規定値   [false]<br>
     * 抽象クラスかどうか。通常は false。
     */
    private boolean fAbstract = false;

    /**
     * フィールド [adjustConstValue]
     *
     * 項目の型 [boolean]<br>
     * 規定値   [true]<br>
     * 定数値の変形をおこなうかどうか。※なるべく変形を利用しないことを推奨したい。※プログラムAPIとして生成する際には、このフィールドを明示的に設定してください。
     */
    private boolean fAdjustConstValue = true;

    /**
     * フィールド [extends]
     *
     * 項目の型 [java.lang.String]<br>
     * 継承するクラスを指定します。
     */
    private String fExtends;

    /**
     * フィールド [fieldList]
     *
     * 項目の型 [java.util.List<blanco.constants.valueobject.BlancoConstantsFieldStructure>]<br>
     * 規定値   [new java.util.ArrayList<blanco.constants.valueobject.BlancoConstantsFieldStructure>()]<br>
     * フィールドを保持するリスト。
     */
    private List<blanco.constants.valueobject.BlancoConstantsFieldStructure> fFieldList = new java.util.ArrayList<blanco.constants.valueobject.BlancoConstantsFieldStructure>();

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
     * フィールド [package]のセッターメソッド
     *
     * 項目の型 [java.lang.String]<br>
     * パッケージ名を指定します。必須項目です。
     *
     * @param argPackage フィールド[package]に格納したい値
     */
    public void setPackage(final String argPackage) {
        fPackage = argPackage;
    }

    /**
     * フィールド[package]のゲッターメソッド
     *
     * 項目の型 [java.lang.String]<br>
     * パッケージ名を指定します。必須項目です。
     *
     * @return フィールド[package]に格納されている値
     */
    public String getPackage() {
        return fPackage;
    }

    /**
     * フィールド [description]のセッターメソッド
     *
     * 項目の型 [java.lang.String]<br>
     * このバリューオブジェクトの説明を記載します。
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
     * このバリューオブジェクトの説明を記載します。
     *
     * @return フィールド[description]に格納されている値
     */
    public String getDescription() {
        return fDescription;
    }

    /**
     * フィールド [suffix]のセッターメソッド
     *
     * 項目の型 [java.lang.String]<br>
     * クラス名のサフィックスを指定します。
     *
     * @param argSuffix フィールド[suffix]に格納したい値
     */
    public void setSuffix(final String argSuffix) {
        fSuffix = argSuffix;
    }

    /**
     * フィールド[suffix]のゲッターメソッド
     *
     * 項目の型 [java.lang.String]<br>
     * クラス名のサフィックスを指定します。
     *
     * @return フィールド[suffix]に格納されている値
     */
    public String getSuffix() {
        return fSuffix;
    }

    /**
     * フィールド [access]のセッターメソッド
     *
     * 項目の型 [java.lang.String]<br>
     * クラスのアクセス。通常は public。
     *
     * @param argAccess フィールド[access]に格納したい値
     */
    public void setAccess(final String argAccess) {
        fAccess = argAccess;
    }

    /**
     * フィールド[access]のゲッターメソッド
     *
     * 項目の型 [java.lang.String]<br>
     * 規定値   ["public"]<br>
     * クラスのアクセス。通常は public。
     *
     * @return フィールド[access]に格納されている値
     */
    public String getAccess() {
        return fAccess;
    }

    /**
     * フィールド [abstract]のセッターメソッド
     *
     * 項目の型 [boolean]<br>
     * 抽象クラスかどうか。通常は false。
     *
     * @param argAbstract フィールド[abstract]に格納したい値
     */
    public void setAbstract(final boolean argAbstract) {
        fAbstract = argAbstract;
    }

    /**
     * フィールド[abstract]のゲッターメソッド
     *
     * 項目の型 [boolean]<br>
     * 規定値   [false]<br>
     * 抽象クラスかどうか。通常は false。
     *
     * @return フィールド[abstract]に格納されている値
     */
    public boolean getAbstract() {
        return fAbstract;
    }

    /**
     * フィールド [adjustConstValue]のセッターメソッド
     *
     * 項目の型 [boolean]<br>
     * 定数値の変形をおこなうかどうか。※なるべく変形を利用しないことを推奨したい。※プログラムAPIとして生成する際には、このフィールドを明示的に設定してください。
     *
     * @param argAdjustConstValue フィールド[adjustConstValue]に格納したい値
     */
    public void setAdjustConstValue(final boolean argAdjustConstValue) {
        fAdjustConstValue = argAdjustConstValue;
    }

    /**
     * フィールド[adjustConstValue]のゲッターメソッド
     *
     * 項目の型 [boolean]<br>
     * 規定値   [true]<br>
     * 定数値の変形をおこなうかどうか。※なるべく変形を利用しないことを推奨したい。※プログラムAPIとして生成する際には、このフィールドを明示的に設定してください。
     *
     * @return フィールド[adjustConstValue]に格納されている値
     */
    public boolean getAdjustConstValue() {
        return fAdjustConstValue;
    }

    /**
     * フィールド [extends]のセッターメソッド
     *
     * 項目の型 [java.lang.String]<br>
     * 継承するクラスを指定します。
     *
     * @param argExtends フィールド[extends]に格納したい値
     */
    public void setExtends(final String argExtends) {
        fExtends = argExtends;
    }

    /**
     * フィールド[extends]のゲッターメソッド
     *
     * 項目の型 [java.lang.String]<br>
     * 継承するクラスを指定します。
     *
     * @return フィールド[extends]に格納されている値
     */
    public String getExtends() {
        return fExtends;
    }

    /**
     * フィールド [fieldList]のセッターメソッド
     *
     * 項目の型 [java.util.List<blanco.constants.valueobject.BlancoConstantsFieldStructure>]<br>
     * フィールドを保持するリスト。
     *
     * @param argFieldList フィールド[fieldList]に格納したい値
     */
    public void setFieldList(final List<blanco.constants.valueobject.BlancoConstantsFieldStructure> argFieldList) {
        fFieldList = argFieldList;
    }

    /**
     * フィールド[fieldList]のゲッターメソッド
     *
     * 項目の型 [java.util.List<blanco.constants.valueobject.BlancoConstantsFieldStructure>]<br>
     * 規定値   [new java.util.ArrayList<blanco.constants.valueobject.BlancoConstantsFieldStructure>()]<br>
     * フィールドを保持するリスト。
     *
     * @return フィールド[fieldList]に格納されている値
     */
    public List<blanco.constants.valueobject.BlancoConstantsFieldStructure> getFieldList() {
        return fFieldList;
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
        buf.append("blanco.constants.valueobject.BlancoConstantsStructure[");
        buf.append("name=" + fName);
        buf.append(",package=" + fPackage);
        buf.append(",description=" + fDescription);
        buf.append(",suffix=" + fSuffix);
        buf.append(",access=" + fAccess);
        buf.append(",abstract=" + fAbstract);
        buf.append(",adjustConstValue=" + fAdjustConstValue);
        buf.append(",extends=" + fExtends);
        buf.append(",fieldList=" + fFieldList);
        buf.append("]");
        return buf.toString();
    }
}
