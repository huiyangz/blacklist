package com.dcits.blacklist.enums;

/** 风险限额编码 */
public enum LimitRef {
    /** 已用非绑定账户入账限额编码 */
    ALRNOBINDCRLIMIT("AlrNoBindCrLimit"),
    /** 已用非绑定账户出账限额编码 */
    ALRNOBINDDRLIMITPY("AlrNoBindDrLimitPy"),
    /** 已用非柜面笔数编码 */
    ALRNOMTLIMIT("AlrNoMTLimit"),
    /** 非绑定账户入账限额编码 */
    NOBINDCRLIMIT("NoBindCrLimit"),
    /** 非绑定账户出账限额编码 */
    NOBINDDRLIMIT("NoBindDrLimit"),
    /** 非柜面日限额编码 */
    NOMTLIMIT("NoMTLimit");

    private String value;

    private LimitRef(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static LimitRef byValue(String value) {
        for (LimitRef item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}