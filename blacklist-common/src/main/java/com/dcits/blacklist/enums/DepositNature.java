package com.dcits.blacklist.enums;

/** 存款性质 */
public enum DepositNature {
    /** 财政性存款 */
    CZCK("CZCK"),
    /** 结算类 */
    JIES("JIES"),
    /** 基金社保 */
    JJSB("JJSB"),
    /** 其他 */
    QT("QT"),
    /** 投融资类 */
    TRZL("TRZL");

    private String value;

    private DepositNature(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static DepositNature byValue(String value) {
        for (DepositNature item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}