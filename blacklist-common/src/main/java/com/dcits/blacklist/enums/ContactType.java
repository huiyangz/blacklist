package com.dcits.blacklist.enums;

/** 联系类型 */
public enum ContactType {
    /** 单位联系信息 */
    VALUE_11("11"),
    /** 家庭联系信息 */
    VALUE_12("12"),
    /** 居住地联系信息 */
    VALUE_13("13"),
    /** 移动联系信息 */
    VALUE_14("14"),
    /** 电子邮箱信息 */
    VALUE_15("15"),
    /** 传真信息 */
    VALUE_16("16"),
    /** 对账单邮寄地址1 */
    VALUE_17("17"),
    /** 对账单邮寄地址2 */
    VALUE_18("18"),
    /** 其他信息 */
    VALUE_19("19"),
    /** 印尼身份联系信息 */
    KTP("KTP");

    private String value;

    private ContactType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static ContactType byValue(String value) {
        for (ContactType item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}