package com.dcits.blacklist.enums;

/** 客户内部信用评级 */
public enum CrRating {
    /** AAA级 */
    VALUE_11("11"),
    /** AA级 */
    VALUE_13("13"),
    /** A级 */
    VALUE_15("15"),
    /** BBB级 */
    VALUE_21("21"),
    /** BB级 */
    VALUE_23("23"),
    /** B级 */
    VALUE_25("25"),
    /** C级 */
    VALUE_35("35");

    private String value;

    private CrRating(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static CrRating byValue(String value) {
        for (CrRating item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}