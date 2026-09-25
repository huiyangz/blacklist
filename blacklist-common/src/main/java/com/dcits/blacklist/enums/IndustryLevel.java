package com.dcits.blacklist.enums;

/** 通用行业层级 */
public enum IndustryLevel {
    /** 一级 */
    VALUE_1("1"),
    /** 二级 */
    VALUE_2("2"),
    /** 三级 */
    VALUE_3("3"),
    /** 四级 */
    VALUE_4("4");

    private String value;

    private IndustryLevel(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static IndustryLevel byValue(String value) {
        for (IndustryLevel item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}