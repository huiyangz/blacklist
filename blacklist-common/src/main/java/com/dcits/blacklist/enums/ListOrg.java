package com.dcits.blacklist.enums;

/** 名单送审机构 */
public enum ListOrg {
    /** 本行 */
    VALUE_0("0"),
    /** 公安 */
    VALUE_200501("200501"),
    /** 工商总局 */
    VALUE_300501("300501"),
    /** 高法(暂缓实现) */
    VALUE_400501("400501"),
    /** 工信部(暂缓实现) */
    VALUE_500501("500501"),
    /** 中国支付清算协会(暂缓实现) */
    VALUE_600501("600501"),
    /** 银行卡清算(暂缓实现) */
    VALUE_700501("700501");

    private String value;

    private ListOrg(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static ListOrg byValue(String value) {
        for (ListOrg item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}