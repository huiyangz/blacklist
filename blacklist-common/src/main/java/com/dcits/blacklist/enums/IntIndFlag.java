package com.dcits.blacklist.enums;

/** 计息标志 */
public enum IntIndFlag {
    /** 正利率计息 */
    Y("Y"),
    /** 负利率计息 */
    F("F"),
    /** 不计息 */
    N("N");

    private String value;

    private IntIndFlag(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static IntIndFlag byValue(String value) {
        for (IntIndFlag item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}