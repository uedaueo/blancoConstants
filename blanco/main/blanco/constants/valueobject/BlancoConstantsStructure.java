package blanco.constants.valueobject;

import java.util.List;

/**
 * BlancoConstantsのなかで利用されるValueObjectです。
 */
public class BlancoConstantsStructure {
    /**
     * フィールド名を指定します。必須項目です。
     *
     * フィールド: [name]。
     */
    private String fName;

    /**
     * パッケージ名を指定します。必須項目です。
     *
     * フィールド: [package]。
     */
    private String fPackage;

    /**
     * このバリューオブジェクトの説明を記載します。
     *
     * フィールド: [description]。
     */
    private String fDescription;

    /**
     * クラス名のサフィックスを指定します。
     *
     * フィールド: [suffix]。
     */
    private String fSuffix;

    /**
     * クラスのアクセス。通常は public。
     *
     * フィールド: [access]。
     * デフォルト: [&quot;public&quot;]。
     */
    private String fAccess = "public";

    /**
     * 抽象クラスかどうか。通常は false。
     *
     * フィールド: [abstract]。
     * デフォルト: [false]。
     */
    private boolean fAbstract = false;

    /**
     * 定数値の変形をおこなうかどうか。※なるべく変形を利用しないことを推奨したい。※プログラムAPIとして生成する際には、このフィールドを明示的に設定してください。
     *
     * フィールド: [adjustConstValue]。
     * デフォルト: [true]。
     */
    private boolean fAdjustConstValue = true;

    /**
     * 継承するクラスを指定します。
     *
     * フィールド: [extends]。
     */
    private String fExtends;

    /**
     * フィールドを保持するリスト。
     *
     * フィールド: [fieldList]。
     * デフォルト: [new java.util.ArrayList&lt;blanco.constants.valueobject.BlancoConstantsFieldStructure&gt;()]。
     */
    private List<blanco.constants.valueobject.BlancoConstantsFieldStructure> fFieldList = new java.util.ArrayList<blanco.constants.valueobject.BlancoConstantsFieldStructure>();

    /**
     * フィールド [name] の値を設定します。
     *
     * フィールドの説明: [フィールド名を指定します。必須項目です。]。
     *
     * @param argName フィールド[name]に設定する値。
     */
    public void setName(final String argName) {
        fName = argName;
    }

    /**
     * フィールド [name] の値を取得します。
     *
     * フィールドの説明: [フィールド名を指定します。必須項目です。]。
     *
     * @return フィールド[name]から取得した値。
     */
    public String getName() {
        return fName;
    }

    /**
     * フィールド [package] の値を設定します。
     *
     * フィールドの説明: [パッケージ名を指定します。必須項目です。]。
     *
     * @param argPackage フィールド[package]に設定する値。
     */
    public void setPackage(final String argPackage) {
        fPackage = argPackage;
    }

    /**
     * フィールド [package] の値を取得します。
     *
     * フィールドの説明: [パッケージ名を指定します。必須項目です。]。
     *
     * @return フィールド[package]から取得した値。
     */
    public String getPackage() {
        return fPackage;
    }

    /**
     * フィールド [description] の値を設定します。
     *
     * フィールドの説明: [このバリューオブジェクトの説明を記載します。]。
     *
     * @param argDescription フィールド[description]に設定する値。
     */
    public void setDescription(final String argDescription) {
        fDescription = argDescription;
    }

    /**
     * フィールド [description] の値を取得します。
     *
     * フィールドの説明: [このバリューオブジェクトの説明を記載します。]。
     *
     * @return フィールド[description]から取得した値。
     */
    public String getDescription() {
        return fDescription;
    }

    /**
     * フィールド [suffix] の値を設定します。
     *
     * フィールドの説明: [クラス名のサフィックスを指定します。]。
     *
     * @param argSuffix フィールド[suffix]に設定する値。
     */
    public void setSuffix(final String argSuffix) {
        fSuffix = argSuffix;
    }

    /**
     * フィールド [suffix] の値を取得します。
     *
     * フィールドの説明: [クラス名のサフィックスを指定します。]。
     *
     * @return フィールド[suffix]から取得した値。
     */
    public String getSuffix() {
        return fSuffix;
    }

    /**
     * フィールド [access] の値を設定します。
     *
     * フィールドの説明: [クラスのアクセス。通常は public。]。
     *
     * @param argAccess フィールド[access]に設定する値。
     */
    public void setAccess(final String argAccess) {
        fAccess = argAccess;
    }

    /**
     * フィールド [access] の値を取得します。
     *
     * フィールドの説明: [クラスのアクセス。通常は public。]。
     * デフォルト: [&quot;public&quot;]。
     *
     * @return フィールド[access]から取得した値。
     */
    public String getAccess() {
        return fAccess;
    }

    /**
     * フィールド [abstract] の値を設定します。
     *
     * フィールドの説明: [抽象クラスかどうか。通常は false。]。
     *
     * @param argAbstract フィールド[abstract]に設定する値。
     */
    public void setAbstract(final boolean argAbstract) {
        fAbstract = argAbstract;
    }

    /**
     * フィールド [abstract] の値を取得します。
     *
     * フィールドの説明: [抽象クラスかどうか。通常は false。]。
     * デフォルト: [false]。
     *
     * @return フィールド[abstract]から取得した値。
     */
    public boolean getAbstract() {
        return fAbstract;
    }

    /**
     * フィールド [adjustConstValue] の値を設定します。
     *
     * フィールドの説明: [定数値の変形をおこなうかどうか。※なるべく変形を利用しないことを推奨したい。※プログラムAPIとして生成する際には、このフィールドを明示的に設定してください。]。
     *
     * @param argAdjustConstValue フィールド[adjustConstValue]に設定する値。
     */
    public void setAdjustConstValue(final boolean argAdjustConstValue) {
        fAdjustConstValue = argAdjustConstValue;
    }

    /**
     * フィールド [adjustConstValue] の値を取得します。
     *
     * フィールドの説明: [定数値の変形をおこなうかどうか。※なるべく変形を利用しないことを推奨したい。※プログラムAPIとして生成する際には、このフィールドを明示的に設定してください。]。
     * デフォルト: [true]。
     *
     * @return フィールド[adjustConstValue]から取得した値。
     */
    public boolean getAdjustConstValue() {
        return fAdjustConstValue;
    }

    /**
     * フィールド [extends] の値を設定します。
     *
     * フィールドの説明: [継承するクラスを指定します。]。
     *
     * @param argExtends フィールド[extends]に設定する値。
     */
    public void setExtends(final String argExtends) {
        fExtends = argExtends;
    }

    /**
     * フィールド [extends] の値を取得します。
     *
     * フィールドの説明: [継承するクラスを指定します。]。
     *
     * @return フィールド[extends]から取得した値。
     */
    public String getExtends() {
        return fExtends;
    }

    /**
     * フィールド [fieldList] の値を設定します。
     *
     * フィールドの説明: [フィールドを保持するリスト。]。
     *
     * @param argFieldList フィールド[fieldList]に設定する値。
     */
    public void setFieldList(final List<blanco.constants.valueobject.BlancoConstantsFieldStructure> argFieldList) {
        fFieldList = argFieldList;
    }

    /**
     * フィールド [fieldList] の値を取得します。
     *
     * フィールドの説明: [フィールドを保持するリスト。]。
     * デフォルト: [new java.util.ArrayList&lt;blanco.constants.valueobject.BlancoConstantsFieldStructure&gt;()]。
     *
     * @return フィールド[fieldList]から取得した値。
     */
    public List<blanco.constants.valueobject.BlancoConstantsFieldStructure> getFieldList() {
        return fFieldList;
    }

    /**
     * このバリューオブジェクトの文字列表現を取得します。
     *
     * <P>使用上の注意</P>
     * <UL>
     * <LI>オブジェクトのシャロー範囲のみ文字列化の処理対象となります。
     * <LI>オブジェクトが循環参照している場合には、このメソッドは使わないでください。
     * </UL>
     *
     * @return バリューオブジェクトの文字列表現。
     */
    @Override
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

    /**
     * このバリューオブジェクトを指定のターゲットに複写します。
     *
     * <P>使用上の注意</P>
     * <UL>
     * <LI>オブジェクトのシャロー範囲のみ複写処理対象となります。
     * <LI>オブジェクトが循環参照している場合には、このメソッドは使わないでください。
     * </UL>
     *
     * @param target target value object.
     */
    public void copyTo(final BlancoConstantsStructure target) {
        if (target == null) {
            throw new IllegalArgumentException("Bug: BlancoConstantsStructure#copyTo(target): argument 'target' is null");
        }

        // No needs to copy parent class.

        // Name: fName
        // Type: java.lang.String
        target.fName = this.fName;
        // Name: fPackage
        // Type: java.lang.String
        target.fPackage = this.fPackage;
        // Name: fDescription
        // Type: java.lang.String
        target.fDescription = this.fDescription;
        // Name: fSuffix
        // Type: java.lang.String
        target.fSuffix = this.fSuffix;
        // Name: fAccess
        // Type: java.lang.String
        target.fAccess = this.fAccess;
        // Name: fAbstract
        // Type: boolean
        target.fAbstract = this.fAbstract;
        // Name: fAdjustConstValue
        // Type: boolean
        target.fAdjustConstValue = this.fAdjustConstValue;
        // Name: fExtends
        // Type: java.lang.String
        target.fExtends = this.fExtends;
        // Name: fFieldList
        // Type: java.util.List
        if (this.fFieldList != null) {
            final java.util.Iterator<blanco.constants.valueobject.BlancoConstantsFieldStructure> iterator = this.fFieldList.iterator();
            for (; iterator.hasNext();) {
                blanco.constants.valueobject.BlancoConstantsFieldStructure loopSource = iterator.next();
                blanco.constants.valueobject.BlancoConstantsFieldStructure loopTarget = null;
                // フィールド[generics]はサポート外の型[blanco.constants.valueobject.BlancoConstantsFieldStructure]です。
                target.fFieldList.add(loopTarget);
            }
        }
    }
}
