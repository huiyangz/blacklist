package com.dcits.blacklist.enums;

/** 账户核实状态 */
public enum AcctVerifyResult {
    /** 未核实 */
    VALUE_1("1"),
    /** 真实已核实已面核 */
    VALUE_2("2"),
    /** 虚假 */
    VALUE_3("3"),
    /** 假名 */
    VALUE_4("4"),
    /** 匿名 */
    VALUE_5("5"),
    /** 无法核实 */
    VALUE_6("6"),
    /** 在有疑义时销户 */
    VALUE_7("7"),
    /** 真实需重核实 */
    VALUE_8("8"),
    /** 真实已核实未面核 */
    VALUE_9("9");

    private String value;

    private AcctVerifyResult(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static AcctVerifyResult byValue(String value) {
        for (AcctVerifyResult item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}