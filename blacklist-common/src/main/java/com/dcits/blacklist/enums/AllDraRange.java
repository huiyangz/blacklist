package com.dcits.blacklist.enums;

/** 通存通兑范围 */
public enum AllDraRange {
    /** 无限制 */
    N001("N001"),
    /** 限制到同省 */
    N002("N002"),
    /** 限制到同城市 */
    N003("N003"),
    /** 限制到同网点 */
    N004("N004");

    private String value;

    private AllDraRange(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static AllDraRange byValue(String value) {
        for (AllDraRange item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}