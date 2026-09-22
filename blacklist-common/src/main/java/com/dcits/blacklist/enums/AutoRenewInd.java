package com.dcits.blacklist.enums;

/** 自动转存标志 */
public enum AutoRenewInd {
    /** 是 */
    Y("Y"),
    /** 否 */
    N("N");

    private String value;

    private AutoRenewInd(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static AutoRenewInd byValue(String value) {
        for (AutoRenewInd item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}