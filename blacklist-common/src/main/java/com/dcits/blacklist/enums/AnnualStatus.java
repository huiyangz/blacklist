package com.dcits.blacklist.enums;

/** 年检通过状态 */
public enum AnnualStatus {
    /** 未年检 */
    N("N"),
    /** 已年检 */
    Y("Y");

    private String value;

    private AnnualStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static AnnualStatus byValue(String value) {
        for (AnnualStatus item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}