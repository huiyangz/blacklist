package com.dcits.blacklist.enums;

/** 客户核实结果 */
public enum ClientVerificationResult {
    /** 未核实 */
    VALUE_01("01"),
    /** 真实 */
    VALUE_02("02"),
    /** 虚假 */
    VALUE_03("03"),
    /** 假名 */
    VALUE_04("04"),
    /** 匿名 */
    VALUE_05("05"),
    /** 无法核实 */
    VALUE_06("06"),
    /** 在有疑义时销户 */
    VALUE_07("07");

    private String value;

    private ClientVerificationResult(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static ClientVerificationResult byValue(String value) {
        for (ClientVerificationResult item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}