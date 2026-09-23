package com.dcits.blacklist.enums;

/** 农民工账户标识 */
public enum FarmerFlag {
    /** 农民工工资专用账户 */
    VALUE_0("0"),
    /** 农民工工资保证金账户 */
    VALUE_1("1"),
    /** 非农民工工资账户 */
    VALUE_2("2");

    private String value;

    private FarmerFlag(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static FarmerFlag byValue(String value) {
        for (FarmerFlag item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}