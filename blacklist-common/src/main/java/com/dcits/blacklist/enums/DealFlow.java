package com.dcits.blacklist.enums;

/** 处理方式 */
public enum DealFlow {
    /** 授权处理 */
    A("A"),
    /** 拒绝处理 */
    B("B"),
    /** 提醒处理 */
    D("D");

    private String value;

    private DealFlow(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static DealFlow byValue(String value) {
        for (DealFlow item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}