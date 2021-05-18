package com.lagou.library;

/**
 * 编程实现手机卡类型的实现
 */
public enum CardTypeEnum {
    BIG("大卡"), SMALL("小卡"), MICRO("微型卡");

    private final String desc; // 用于描述卡类型的成员变量

    private CardTypeEnum(String desc) { this.desc = desc; }
}
