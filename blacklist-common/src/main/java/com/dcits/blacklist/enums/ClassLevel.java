package com.dcits.blacklist.enums;

/** 客户营销等级 */
public enum ClassLevel {
    /** 普通客户 */
    VALUE_1("1"),
    /** 潜力客户 */
    VALUE_2("2"),
    /** 中端客户 */
    VALUE_3("3"),
    /** 财富客户 */
    VALUE_4("4"),
    /** 私行客户 */
    VALUE_5("5");

    private String value;

    private ClassLevel(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static ClassLevel byValue(String value) {
        for (ClassLevel item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}