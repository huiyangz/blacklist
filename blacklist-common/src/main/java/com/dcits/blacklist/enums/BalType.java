package com.dcits.blacklist.enums;

/** 余额类型 */
public enum BalType {
    /** 钞余额 */
    CA("CA"),
    /** 汇余额 */
    TT("TT");

    private String value;

    private BalType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static BalType byValue(String value) {
        for (BalType item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}