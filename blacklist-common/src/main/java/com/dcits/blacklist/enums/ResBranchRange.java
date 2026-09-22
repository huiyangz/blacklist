package com.dcits.blacklist.enums;

/** 限制机构范围 */
public enum ResBranchRange {
    /** 所有机构 */
    A("A"),
    /** 本机构及下属机构 */
    B("B"),
    /** 当前机构 */
    C("C"),
    /** 开户机构及其上级机构 */
    D("D"),
    /** 总行 */
    F("F");

    private String value;

    private ResBranchRange(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static ResBranchRange byValue(String value) {
        for (ResBranchRange item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}