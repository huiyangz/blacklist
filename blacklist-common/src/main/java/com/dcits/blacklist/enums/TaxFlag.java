package com.dcits.blacklist.enums;

/** 收税标识 */
public enum TaxFlag {
    /** 中国税收居民 */
    VALUE_1("1"),
    /** 非中国税收居民 */
    VALUE_2("2"),
    /** 既是中国税收居民又是其他国家（地区）税收居民 */
    VALUE_3("3"),
    /** 否 */
    N("N"),
    /** 是 */
    Y("Y");

    private String value;

    private TaxFlag(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static TaxFlag byValue(String value) {
        for (TaxFlag item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}