package com.lagou.library;

/**
 * 编程实现用户消费信息类的封装
 */
public class UserConsumption {
    // 1.私有化成员变量，使用private关键字修饰
    private int talkTime;    // 用于描述通话时长的成员变量
    private double netFlow;  // 用于描述上网流量的成员变量
    private double rate;     // 用于描述每月资费的成员变量

    // 3.在构造方法中调用set方法进行合理值的判断
    public UserConsumption() {
    }

    public UserConsumption(int talkTime, double netFlow, double rate) {
        setTalkTime(talkTime);
        setNetFlow(netFlow);
        setRate(rate);
    }

    // 2.提供公有的get和set方法，并在方法体中进行合理值的判断，判断这里省略了
    public int getTalkTime() {
        return talkTime;
    }

    public void setTalkTime(int talkTime) {
        this.talkTime = talkTime;
    }

    public double getNetFlow() {
        return netFlow;
    }

    public void setNetFlow(double netFlow) {
        this.netFlow = netFlow;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    // 4.实现用户消费信息的打印
    public void show() {
        System.out.println("用户消费信息: 通话时间为: " + getTalkTime() + "，上网流量为: " + getNetFlow() + "，月资费为: " + getRate());
    }
}
