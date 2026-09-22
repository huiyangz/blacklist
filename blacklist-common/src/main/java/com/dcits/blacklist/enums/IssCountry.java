package com.dcits.blacklist.enums;

/** 国家和地区 */
public enum IssCountry {
    /** 阿富汗 */
    AFG("AFG"),
    /** 澳大利亚 */
    AUS("AUS"),
    /** 奥地利 */
    AUT("AUT"),
    /** 比利时 */
    BEL("BEL"),
    /** 巴西 */
    BRA("BRA"),
    /** 加拿大 */
    CAN("CAN"),
    /** 瑞士 */
    CHE("CHE"),
    /** 中华人民共和国 */
    CHN("CHN"),
    /** 德国 */
    DEU("DEU"),
    /** 西班牙 */
    ESP("ESP"),
    /** 法国 */
    FRA("FRA"),
    /** 英国 */
    GBR("GBR"),
    /** 香港特别行政区 */
    HKG("HKG"),
    /** 匈牙利 */
    HUN("HUN"),
    /** 印度 */
    IND("IND"),
    /** 爱尔兰 */
    IRL("IRL"),
    /** 伊朗 */
    IRN("IRN"),
    /** 伊拉克 */
    IRQ("IRQ"),
    /** 以色列 */
    ISR("ISR"),
    /** 意大利 */
    ITA("ITA"),
    /** 日本 */
    JPN("JPN"),
    /** 韩国 */
    KOR("KOR"),
    /** 澳门特别行政区 */
    MAC("MAC"),
    /** 墨西哥 */
    MEX("MEX"),
    /** 马来西亚 */
    MYS("MYS"),
    /** 荷兰 */
    NLD("NLD"),
    /** 新西兰 */
    NZL("NZL"),
    /** 巴基斯坦 */
    PAK("PAK"),
    /** 菲律宾 */
    PHL("PHL"),
    /** 朝鲜 */
    PRK("PRK"),
    /** 葡萄牙 */
    PRT("PRT"),
    /** 俄罗斯 */
    RUS("RUS"),
    /** 新加坡 */
    SGP("SGP"),
    /** 泰国 */
    THA("THA"),
    /** 土耳其 */
    TUR("TUR"),
    /** 乌克兰 */
    UKR("UKR"),
    /** 美国 */
    USA("USA"),
    /** 越南 */
    VNM("VNM");

    private String value;

    private IssCountry(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static IssCountry byValue(String value) {
        for (IssCountry item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}