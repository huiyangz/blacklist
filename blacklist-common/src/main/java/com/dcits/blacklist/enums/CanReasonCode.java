package com.dcits.blacklist.enums;

/** 作废原因 */
public enum CanReasonCode {
    /** 销户作废 */
    VALUE_1("1"),
    /** 销户收回 */
    VALUE_2("2"),
    /** 手工收回 */
    VALUE_3("3"),
    /** 解挂作废 */
    VALUE_4("4"),
    /** 更换作废 */
    VALUE_5("5"),
    /** 法院作废 */
    VALUE_6("6"),
    /** 冲正作废 */
    VALUE_7("7"),
    /** 其他 */
    VALUE_99("99");

    private String value;

    private CanReasonCode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static CanReasonCode byValue(String value) {
        for (CanReasonCode item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}