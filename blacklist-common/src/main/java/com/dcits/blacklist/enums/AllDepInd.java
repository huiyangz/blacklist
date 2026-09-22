package com.dcits.blacklist.enums;

/** 通存标识 */
public enum AllDepInd {
    /** 允许全行存入 */
    N001("N001"),
    /** 允许分行存入 */
    N002("N002"),
    /** 允许同城跨行存入 */
    N003("N003"),
    /** 不允许跨行存入 */
    N004("N004");

    private String value;

    private AllDepInd(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static AllDepInd byValue(String value) {
        for (AllDepInd item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}