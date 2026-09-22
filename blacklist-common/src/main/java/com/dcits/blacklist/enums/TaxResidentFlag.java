package com.dcits.blacklist.enums;

/** 税收居民标识 */
public enum TaxResidentFlag {
    /** 中国税收居民 */
    VALUE_1("1"),
    /** 非居民 */
    VALUE_2("2"),
    /** 既是中国税收居民又是其他国家（地区）税收居民 */
    VALUE_3("3");

    private String value;

    private TaxResidentFlag(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static TaxResidentFlag byValue(String value) {
        for (TaxResidentFlag item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}