package com.dcits.blacklist.enums;

/** 账户状态 */
public enum AcctStatus {
    /** 活动 */
    A("A"),
    /** 关闭 */
    C("C"),
    /** 睡眠 */
    D("D"),
    /** 待激活 */
    H("H"),
    /** 预开户 */
    I("I"),
    /** 新建 */
    N("N"),
    /** 转营业外 */
    O("O"),
    /** 逾期 */
    P("P"),
    /** 预销户 */
    R("R"),
    /** 久悬 */
    S("S"),
    /** 手工解除 */
    U("U");

    private String value;

    private AcctStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static AcctStatus byValue(String value) {
        for (AcctStatus item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}