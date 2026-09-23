package com.dcits.blacklist.enums;

/** 民族 */
public enum Nation {
    /** 汉族 */
    VALUE_1("1"),
    /** 蒙古族 */
    VALUE_2("2"),
    /** 回族 */
    VALUE_3("3"),
    /** 藏族 */
    VALUE_4("4"),
    /** 维吾尔族 */
    VALUE_5("5"),
    /** 苗族 */
    VALUE_6("6"),
    /** 彝族 */
    VALUE_7("7"),
    /** 壮族 */
    VALUE_8("8"),
    /** 布依族 */
    VALUE_9("9"),
    /** 朝鲜族 */
    VALUE_10("10"),
    /** 满族 */
    VALUE_11("11"),
    /** 侗族 */
    VALUE_12("12"),
    /** 瑶族 */
    VALUE_13("13"),
    /** 白族 */
    VALUE_14("14"),
    /** 土家族 */
    VALUE_15("15"),
    /** 哈尼族 */
    VALUE_16("16"),
    /** 哈萨克族 */
    VALUE_17("17"),
    /** 傣族 */
    VALUE_18("18"),
    /** 黎族 */
    VALUE_19("19"),
    /** 傈僳族 */
    VALUE_20("20"),
    /** 佤族 */
    VALUE_21("21"),
    /** 畲族 */
    VALUE_22("22"),
    /** 高山族 */
    VALUE_23("23"),
    /** 拉祜族 */
    VALUE_24("24"),
    /** 水族 */
    VALUE_25("25"),
    /** 东乡族 */
    VALUE_26("26"),
    /** 纳西族 */
    VALUE_27("27"),
    /** 景颇族 */
    VALUE_28("28"),
    /** 柯尔克孜族 */
    VALUE_29("29"),
    /** 土族 */
    VALUE_30("30"),
    /** 达斡尔族 */
    VALUE_31("31"),
    /** 仫佬族 */
    VALUE_32("32"),
    /** 羌族 */
    VALUE_33("33"),
    /** 布朗族 */
    VALUE_34("34"),
    /** 撒拉族 */
    VALUE_35("35"),
    /** 毛南族 */
    VALUE_36("36"),
    /** 仡佬族 */
    VALUE_37("37"),
    /** 锡伯族 */
    VALUE_38("38"),
    /** 阿昌族 */
    VALUE_39("39"),
    /** 普米族 */
    VALUE_40("40"),
    /** 塔吉克族 */
    VALUE_41("41"),
    /** 怒族 */
    VALUE_42("42"),
    /** 乌孜别克族 */
    VALUE_43("43"),
    /** 俄罗斯族 */
    VALUE_44("44"),
    /** 鄂温克族 */
    VALUE_45("45"),
    /** 德昂族 */
    VALUE_46("46"),
    /** 保安族 */
    VALUE_47("47"),
    /** 裕固族 */
    VALUE_48("48"),
    /** 京族 */
    VALUE_49("49"),
    /** 塔塔尔族 */
    VALUE_50("50"),
    /** 独龙族 */
    VALUE_51("51"),
    /** 鄂伦春族 */
    VALUE_52("52"),
    /** 赫哲族 */
    VALUE_53("53"),
    /** 门巴族 */
    VALUE_54("54"),
    /** 珞巴族 */
    VALUE_55("55"),
    /** 基诺族 */
    VALUE_56("56");

    private String value;

    private Nation(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Nation byValue(String value) {
        for (Nation item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}