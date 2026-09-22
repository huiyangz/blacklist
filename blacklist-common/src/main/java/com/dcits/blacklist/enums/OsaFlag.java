package com.dcits.blacklist.enums;

/** 离岸标记 */
public enum OsaFlag {
    /** offshore(离岸) */
    N("N"),
    /** inland(本地) */
    Y("Y");

    private String value;

    private OsaFlag(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static OsaFlag byValue(String value) {
        for (OsaFlag item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}