package com.dcits.blacklist.enums;

/** 性别 */
public enum Sex {
    /** 未知的性别 */
    VALUE_0("0"),
    /** 男性 */
    VALUE_1("1"),
    /** 女性 */
    VALUE_2("2"),
    /** 未说明的性别 */
    VALUE_9("9");

    private String value;

    private Sex(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Sex byValue(String value) {
        for (Sex item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}