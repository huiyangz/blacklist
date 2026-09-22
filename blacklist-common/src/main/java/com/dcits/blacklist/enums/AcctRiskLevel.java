package com.dcits.blacklist.enums;

/** 风险等级 */
public enum AcctRiskLevel {
    /** 零级风险 */
    VALUE_0("0"),
    /** 一级风险 */
    VALUE_1("1"),
    /** 二级风险 */
    VALUE_2("2"),
    /** 三级风险 */
    VALUE_3("3"),
    /** 四级风险 */
    VALUE_4("4"),
    /** 五级风险 */
    VALUE_5("5"),
    /** 六级风险 */
    VALUE_6("6");

    private String value;

    private AcctRiskLevel(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static AcctRiskLevel byValue(String value) {
        for (AcctRiskLevel item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}