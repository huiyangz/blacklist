package com.dcits.blacklist.enums;

/** 定期账户类型 */
public enum FixedCall {
    /** 协议存款 */
    A("A"),
    /** 定期一本通 */
    B("B"),
    /** 通知存款 */
    C("C"),
    /** 定活两便 */
    D("D"),
    /** 教育储蓄 */
    E("E"),
    /** 整存整取 */
    F("F"),
    /** 零存整取 */
    L("L"),
    /** 大额存单 */
    M("M");

    private String value;

    private FixedCall(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static FixedCall byValue(String value) {
        for (FixedCall item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}