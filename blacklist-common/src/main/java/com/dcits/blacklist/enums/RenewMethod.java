package com.dcits.blacklist.enums;

/** 到期转存方式 */
public enum RenewMethod {
    /** 本金转存 */
    W("W"),
    /** 本息转存 */
    O("O");

    private String value;

    private RenewMethod(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static RenewMethod byValue(String value) {
        for (RenewMethod item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}