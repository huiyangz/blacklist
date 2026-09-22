package com.dcits.blacklist.enums;

/** 监管类型 */
public enum ManageType {
    /** 免查证 */
    VALUE_9("9"),
    /** 预售房资金监管 */
    VALUE_1("1"),
    /** 工程建设领域或农民工工资监管 */
    VALUE_2("2"),
    /** 二手房转让资金监管 */
    VALUE_3("3"),
    /** 房地产开发业务监管 */
    VALUE_4("4"),
    /** 募集资金监管 */
    VALUE_5("5"),
    /** 其他监管 */
    VALUE_6("6"),
    /** 专项债专户 */
    VALUE_7("7");

    private String value;

    private ManageType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static ManageType byValue(String value) {
        for (ManageType item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}