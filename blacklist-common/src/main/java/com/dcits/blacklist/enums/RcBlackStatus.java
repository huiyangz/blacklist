package com.dcits.blacklist.enums;

/** 协议状态 */
public enum RcBlackStatus {
    /** 生效 */
    A("A"),
    /** 全部 */
    ALL("ALL"),
    /** 失效 */
    E("E"),
    /** 预登记 */
    N("N"),
    /** 暂停 */
    S("S"),
    /** 终止 */
    T("T");

    private String value;

    private RcBlackStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static RcBlackStatus byValue(String value) {
        for (RcBlackStatus item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}