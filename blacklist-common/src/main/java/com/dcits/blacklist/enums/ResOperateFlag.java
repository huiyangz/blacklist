package com.dcits.blacklist.enums;

/** 黑名单限制操作标识 */
public enum ResOperateFlag {
    /** 控制 */
    C("C"),
    /** 异常 */
    E("E");

    private String value;

    private ResOperateFlag(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static ResOperateFlag byValue(String value) {
        for (ResOperateFlag item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}