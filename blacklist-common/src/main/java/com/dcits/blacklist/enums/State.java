package com.dcits.blacklist.enums;

/** 省 */
public enum State {
    /** 北京市 */
    VALUE_11("11"),
    /** 天津市 */
    VALUE_12("12"),
    /** 河北省 */
    VALUE_13("13"),
    /** 山西省 */
    VALUE_14("14"),
    /** 内蒙古自治区 */
    VALUE_15("15"),
    /** 辽宁省 */
    VALUE_21("21"),
    /** 吉林省 */
    VALUE_22("22"),
    /** 黑龙江省 */
    VALUE_23("23"),
    /** 上海市 */
    VALUE_31("31"),
    /** 江苏省 */
    VALUE_32("32"),
    /** 浙江省 */
    VALUE_33("33"),
    /** 安徽省 */
    VALUE_34("34"),
    /** 福建省 */
    VALUE_35("35"),
    /** 江西省 */
    VALUE_36("36"),
    /** 山东省 */
    VALUE_37("37"),
    /** 河南省 */
    VALUE_41("41"),
    /** 湖北省 */
    VALUE_42("42"),
    /** 湖南省 */
    VALUE_43("43"),
    /** 广东省 */
    VALUE_44("44"),
    /** 广西壮族自治区 */
    VALUE_45("45"),
    /** 海南省 */
    VALUE_46("46"),
    /** 重庆市 */
    VALUE_50("50"),
    /** 四川省 */
    VALUE_51("51"),
    /** 贵州省 */
    VALUE_52("52"),
    /** 云南省 */
    VALUE_53("53"),
    /** 西藏自治区 */
    VALUE_54("54"),
    /** 陕西省 */
    VALUE_61("61"),
    /** 甘肃省 */
    VALUE_62("62"),
    /** 青海省 */
    VALUE_63("63"),
    /** 宁夏回族自治区 */
    VALUE_64("64"),
    /** 新疆维吾尔自治区 */
    VALUE_65("65"),
    /** 台湾省 */
    VALUE_71("71"),
    /** 香港特别行政区 */
    VALUE_81("81"),
    /** 澳门特别行政区 */
    VALUE_82("82"),
    /** 其他 */
    VALUE_99("99"),
    /** 阿姆斯特丹/Amsterdam */
    AD("AD"),
    /** 安卡拉/Ankara */
    AK("AK"),
    /** 巴西利亚/Brasilia */
    BA("BA"),
    /** 巴格达/Baghdad */
    BD("BD"),
    /** 曼谷/Bangkok */
    BK("BK"),
    /** 柏林/Berlin */
    BL("BL"),
    /** 布达佩斯/Budapest */
    BP("BP"),
    /** 伯尔尼/Bern */
    BR("BR"),
    /** 布鲁塞尔/Brussels */
    BS("BS"),
    /** 堪培拉/Canberra */
    CB("CB"),
    /** 华盛顿/Washington D.C. */
    DC("DC"),
    /** 都柏林/Dublin */
    DL("DL"),
    /** 香港 */
    HG("HG"),
    /** 河内/Hanoi */
    HN("HN"),
    /** 喀布尔 */
    KB("KB"),
    /** 基辅/Kyiv */
    KI("KI"),
    /** 吉隆坡 */
    KL("KL"),
    /** 伊斯兰堡/Lslamabad */
    LB("LB"),
    /** 伦敦/London */
    LD("LD"),
    /** 里斯本/Lisbon */
    LS("LS"),
    /** 墨西哥城/Mexico City */
    MX("MX"),
    /** 莫斯科/Moscow */
    MC("MC"),
    /** 马尼拉/Manila */
    ML("ML"),
    /** 澳门 */
    MO("MO"),
    /** 马德里/Madrid */
    MR("MR"),
    /** 新德里/New Delhi */
    ND("ND"),
    /** 渥太华/Ottawa */
    OW("OW"),
    /** 巴黎/Paris */
    PI("PI"),
    /** 平壤/Pyongyang */
    PY("PY"),
    /** 罗马/Rome */
    RM("RM"),
    /** 新加坡市/Singapore City */
    SC("SC"),
    /** 汉城/Seoul */
    SE("SE"),
    /** 东京/Tokyo */
    TK("TK"),
    /** 台北 */
    TP("TP"),
    /** 德黑兰/Tehran */
    TR("TR"),
    /** 特拉维夫/Telaviv */
    TV("TV"),
    /** 维也纳/Vienna */
    VN("VN"),
    /** 惠灵顿/Wellington */
    WT("WT");

    private String value;

    private State(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static State byValue(String value) {
        for (State item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}