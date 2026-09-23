package com.dcits.blacklist.enums;

/** 简易账户标志 */
public enum SimpleAcct {
    /** 非简易账户 */
    N("N"),
    /** 简易账户 */
    Y("Y");

    private String value;

    private SimpleAcct(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static SimpleAcct byValue(String value) {
        for (SimpleAcct item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}