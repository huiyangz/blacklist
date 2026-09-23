package com.dcits.blacklist.enums;

/** 学历 */
public enum Education {
    /** 研究生教育 */
    VALUE_10("10"),
    /** 博士研究生毕业 */
    VALUE_11("11"),
    /** 博士研究生结业 */
    VALUE_12("12"),
    /** 博士研究生肄业 */
    VALUE_13("13"),
    /** 硕士研究生毕业 */
    VALUE_14("14"),
    /** 硕士研究生结业 */
    VALUE_15("15"),
    /** 硕士研究生肄业 */
    VALUE_16("16"),
    /** 研究生班毕业 */
    VALUE_17("17"),
    /** 研究生班结业 */
    VALUE_18("18"),
    /** 研究生班肄业 */
    VALUE_19("19"),
    /** 大学本科 */
    VALUE_20("20"),
    /** 大学本科毕业 */
    VALUE_21("21"),
    /** 大学本科结业 */
    VALUE_22("22"),
    /** 大学本科肄业 */
    VALUE_23("23"),
    /** 大学普通班毕业 */
    VALUE_28("28"),
    /** 专科教育 */
    VALUE_30("30"),
    /** 大学专科毕业 */
    VALUE_31("31"),
    /** 大学专科结业 */
    VALUE_32("32"),
    /** 大学专科肄业 */
    VALUE_33("33"),
    /** 中等职业教育 */
    VALUE_40("40"),
    /** 中等专科毕业 */
    VALUE_41("41"),
    /** 中等专科结业 */
    VALUE_42("42"),
    /** 中等专科肄业 */
    VALUE_43("43"),
    /** 职业高中毕业 */
    VALUE_44("44"),
    /** 职业高中结业 */
    VALUE_45("45"),
    /** 职业高中肄业 */
    VALUE_46("46"),
    /** 技工学校毕业 */
    VALUE_47("47"),
    /** 技工学校结业 */
    VALUE_48("48"),
    /** 技工学校肄业 */
    VALUE_49("49"),
    /** 普通高级中学教育 */
    VALUE_60("60"),
    /** 普通高中毕业 */
    VALUE_61("61"),
    /** 普通高中结业 */
    VALUE_62("62"),
    /** 普通高中肄业 */
    VALUE_63("63"),
    /** 初级中学教育 */
    VALUE_70("70"),
    /** 初中毕业 */
    VALUE_71("71"),
    /** 初中肄业 */
    VALUE_73("73"),
    /** 小学教育 */
    VALUE_80("80"),
    /** 小学毕业 */
    VALUE_81("81"),
    /** 小学肄业 */
    VALUE_83("83"),
    /** 其他 */
    VALUE_90("90");

    private String value;

    private Education(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Education byValue(String value) {
        for (Education item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}