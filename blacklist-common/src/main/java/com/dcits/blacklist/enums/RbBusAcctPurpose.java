package com.dcits.blacklist.enums;

/** 对公存款账户用途 */
public enum RbBusAcctPurpose {
    /** 无特殊用途 */
    VALUE_0("0"),
    /** 注册验资 */
    VALUE_1("1"),
    /** 增资验资 */
    VALUE_2("2"),
    /** 非预算单位专用 */
    VALUE_3("3"),
    /** 预算单位专用 */
    VALUE_4("4"),
    /** 投融资性 */
    VALUE_5("5"),
    /** 结算性 */
    VALUE_6("6"),
    /** 资本项下 */
    VALUE_501("501"),
    /** 经常项下 */
    VALUE_601("601"),
    /** 财政收入 */
    VALUE_901("901"),
    /** 财政支出 */
    VALUE_902("902"),
    /** 招投标 */
    VALUE_903("903"),
    /** 医保 */
    VALUE_904("904"),
    /** 社保 */
    VALUE_905("905");

    private String value;

    private RbBusAcctPurpose(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static RbBusAcctPurpose byValue(String value) {
        for (RbBusAcctPurpose item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}