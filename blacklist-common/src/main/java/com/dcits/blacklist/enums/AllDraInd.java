package com.dcits.blacklist.enums;

/** 通兑标识 */
public enum AllDraInd {
    /** 允许全行支取 */
    N001("N001"),
    /** 允许分行支取 */
    N002("N002"),
    /** 允许同城跨行支取 */
    N003("N003"),
    /** 不允许跨行支取 */
    N004("N004");

    private String value;

    private AllDraInd(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static AllDraInd byValue(String value) {
        for (AllDraInd item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}