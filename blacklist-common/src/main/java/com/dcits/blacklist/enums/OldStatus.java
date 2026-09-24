package com.dcits.blacklist.enums;

/** 凭证状态 */
public enum OldStatus {
    /** 已承兑 */
    ACP("ACP"),
    /** 已签发出售 */
    ACT("ACT"),
    /** 已作废 */
    CAN("CAN"),
    /** 销毁 */
    DES("DES"),
    /** 待激活 */
    DJH("DJH"),
    /** 丢失 */
    LCB("LCB"),
    /** 正式挂失 */
    LCC("LCC"),
    /** 已锁定 */
    LOC("LOC"),
    /** 未使用 */
    NUS("NUS"),
    /** 已退回 */
    PBK("PBK"),
    /** 已兑付 */
    POB("POB"),
    /** 已结清 */
    SET("SET"),
    /** 手工销号 */
    SGX("SGX"),
    /** 已收回 */
    USE("USE"),
    /** 口头挂失 */
    VER("VER"),
    /** 未使用在途 */
    WAY("WAY"),
    /** 已作废在途 */
    WCA("WCA"),
    /** 待销毁 */
    WDE("WDE"),
    /** 待销毁在途 */
    WWA("WWA");

    private String value;

    private OldStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static OldStatus byValue(String value) {
        for (OldStatus item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}