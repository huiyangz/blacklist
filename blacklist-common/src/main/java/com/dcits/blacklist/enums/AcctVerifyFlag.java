package com.dcits.blacklist.enums;

/** 是否 */
public enum AcctVerifyFlag {
    /** N */
    N("N"),
    /** Y */
    Y("Y");

    private String value;

    private AcctVerifyFlag(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static AcctVerifyFlag byValue(String value) {
        for (AcctVerifyFlag item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}