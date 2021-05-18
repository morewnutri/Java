package com.lagou.library;

/**
 * 编程实现手机卡类的封装
 */
public class PhoneCard {
    // 1.私有化成员变量，使用private关键字修饰
    private CardTypeEnum cardType;  // 用于描述卡类型的成员变量
    private String cardNumber;      // 用于描述卡号的成员变量
    private String userName;        // 用于描述用户名的成员变量
    private String password;        // 用于描述密码的成员变量
    private double balance;         // 用于描述账户余额的成员变量
    private int talkTime;           // 用于描述通话时长的成员变量
    private double netFlow;         // 用于描述上网流量的成员变量

    // 3.在构造方法中调用set方法进行合理值的判断
    public PhoneCard() {
    }

    public PhoneCard(CardTypeEnum cardType, String cardNumber, String userName, String password, double balance, int talkTime, double netFlow) {
        setCardType(cardType);
        setCardNumber(cardNumber);
        setUserName(userName);
        setPassword(password);
        setBalance(balance);
        setTalkTime(talkTime);
        setNetFlow(netFlow);
    }

    // 2.提供公有的get和set方法，并在方法中进行合理值的判断，以通话时长为例进行处理
    public CardTypeEnum getCardType() {
        return cardType;
    }

    public void setCardType(CardTypeEnum cardType) {
        this.cardType = cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getTalkTime() {
        return talkTime;
    }

    public void setTalkTime(int talkTime) {
        if (talkTime >= 0) {
            this.talkTime = talkTime;
        } else {
            System.out.println("通话时长不合理哦！！！");
        }
    }

    public double getNetFlow() {
        return netFlow;
    }

    public void setNetFlow(double netFlow) {
        this.netFlow = netFlow;
    }

    // 4.提供显示（卡号 + 用户名 + 当前余额）的方法
    public void show(){
        System.out.println("卡号为: "+ getCardNumber() + "，用户名为: " + getUserName() + "，当前余额为: " + getBalance() + "元!");
    }
}
