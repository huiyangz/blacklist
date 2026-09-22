package com.dcits.blacklist.enums;

/** 渠道控制类型 */
public enum OthControlType {
    /** 暂停非柜面 */
    VALUE_0("0"),
    /** 网上银行渠道控制 */
    VALUE_1("1"),
    /** 手机银行渠道控制 */
    VALUE_2("2"),
    /** 网关支付渠道控制 */
    VALUE_3("3"),
    /** 快捷支付渠道控制 */
    VALUE_4("4"),
    /** POS机渠道控制 */
    VALUE_5("5"),
    /** ATM/CRS（存取一体机）渠道控制 */
    VALUE_6("6"),
    /** 暂停非柜面-多人无合理理由使用同一联系电话 */
    VALUE_7("7"),
    /** 暂停非柜面-账户交易存在可疑 */
    VALUE_8("8"),
    /** 暂停非柜面-证件到期 */
    VALUE_9("9"),
    /** 暂停非柜面-涉赌处置专用 */
    VALUE_10("10"),
    /** 暂停非柜面-涉虚拟货币专用 */
    VALUE_11("11"),
    /** 暂停非柜面-涉案账户（261号文）专用 */
    VALUE_12("12"),
    /** 暂停非柜面-买卖账户惩戒（85号文） */
    VALUE_13("13"),
    /** 暂停非柜面-涉恐处置专用 */
    VALUE_14("14"),
    /** 暂停非柜面-客户信息缺失 */
    VALUE_15("15"),
    /** 暂停非柜面-反洗钱处置专用 */
    VALUE_16("16"),
    /** 暂停非柜面-账户/资金监管 */
    VALUE_17("17"),
    /** 暂停非柜面-其他 */
    VALUE_18("18"),
    /** 暂停非柜面-开户之日起6个月无交易记录 */
    VALUE_19("19"),
    /** 暂停非柜面-需重核实 */
    VALUE_20("20"),
    /** 暂停非柜面-联系查证异常 */
    VALUE_21("21"),
    /** 涉案关联账户暂停非柜面业务 */
    VALUE_22("22");

    private String value;

    private OthControlType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static OthControlType byValue(String value) {
        for (OthControlType item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}