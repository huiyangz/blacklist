package com.dcits.blacklist.enums;

/** 存款账户类型 */
public enum RbAcctType {
    /** AIO账户 */
    A("A"),
    /** 结算账户 */
    C("C"),
    /** 储蓄账户 */
    S("S"),
    /** 定期账户 */
    T("T");

    private String value;

    private RbAcctType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static RbAcctType byValue(String value) {
        for (RbAcctType item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}