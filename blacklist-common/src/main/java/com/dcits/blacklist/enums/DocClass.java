package com.dcits.blacklist.enums;

/** 凭证种类 */
public enum DocClass {
    /** 银行承兑汇票 */
    BAT("BAT"),
    /** 银行票据 */
    BNK("BNK"),
    /** 商业承兑汇票 */
    CAT("CAT"),
    /** 存款证明 */
    CFT("CFT"),
    /** 支票 */
    CHK("CHK"),
    /** 支票 */
    CHQ("CHQ"),
    /** 托收票据 */
    COL("COL"),
    /** 卡 */
    CRD("CRD"),
    /** 存单 */
    DCT("DCT"),
    /** 银行汇票 */
    DFT("DFT"),
    /** 其他 */
    OTH("OTH"),
    /** 存折 */
    PBK("PBK"),
    /** 印鉴 */
    SCV("SCV"),
    /** 旅行支票 */
    TCH("TCH");

    private String value;

    private DocClass(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static DocClass byValue(String value) {
        for (DocClass item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}