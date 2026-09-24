package com.dcits.blacklist.enums;

/** 期限类型 */
public enum TermType {
    /** 日 */
    D("D"),
    /** 半年 */
    H("H"),
    /** 月 */
    M("M"),
    /** 季 */
    Q("Q"),
    /** 周 */
    W("W"),
    /** 年 */
    Y("Y");

    private String value;

    private TermType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static TermType byValue(String value) {
        for (TermType item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}