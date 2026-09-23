package com.dcits.blacklist.enums;

/** 查证类型 */
public enum CheckCertificateType {
    /** 全部查证 */
    VALUE_01("01"),
    /** 对非资金类业务查证 */
    VALUE_02("02"),
    /** 对资金类业务查证 */
    VALUE_03("03"),
    /** 免查证 */
    VALUE_04("04");

    private String value;

    private CheckCertificateType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static CheckCertificateType byValue(String value) {
        for (CheckCertificateType item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}