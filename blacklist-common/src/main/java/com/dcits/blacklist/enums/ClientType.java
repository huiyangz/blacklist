package com.dcits.blacklist.enums;

/** 客户类型 */
public enum ClientType {
    /** 个人 */
    VALUE_100("100"),
    /** 公司 */
    VALUE_200("200"),
    /** 金融机构 */
    VALUE_300("300"),
    /** 内部客户 */
    VALUE_600("600");

    private String value;

    private ClientType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static ClientType byValue(String value) {
        for (ClientType item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}