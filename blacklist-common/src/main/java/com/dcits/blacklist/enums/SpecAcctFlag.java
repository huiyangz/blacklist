package com.dcits.blacklist.enums;

/** 定制账户类型 */
public enum SpecAcctFlag {
    /** 定制账户 */
    Y("Y"),
    /** 非定制账户 */
    N("N"),
    /** 全账户定制 */
    A("A"),
    /** 指定账户顺序号 */
    P("P");

    private String value;

    private SpecAcctFlag(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static SpecAcctFlag byValue(String value) {
        for (SpecAcctFlag item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}