package com.lagou.library;

/**
 * 编程实现通话套餐类的封装
 */
public class TalkPackageServiceImpl extends AbstractPackage implements TalkService {
    // 1.私有化成员变量，使用private关键字修饰
    private int talkTime;  // 用于描述通话时长的成员变量
    private int msgNumber; // 用于描述短信条数的成员变量

    // 3.在构造方法中调用set方法进行合理值的判断
    public TalkPackageServiceImpl() {
    }
    public TalkPackageServiceImpl(double rate, int talkTime, int msgNumber) {
        super(rate);
        setTalkTime(talkTime);
        setMsgNumber(msgNumber);
    }

    // 2.提供公有的get和set方法，并在方法体中进行合理值的判断，以短信条数为例判断
    public int getTalkTime() {
        return talkTime;
    }

    public void setTalkTime(int talkTime) {
        this.talkTime = talkTime;
    }

    public int getMsgNumber() {
        return msgNumber;
    }

    public void setMsgNumber(int msgNumber) {
        if (msgNumber >= 0) {
            this.msgNumber = msgNumber;
        } else {
            System.out.println("短信条数不合理哦！！！");
        }
    }

    // 4.显示所有套餐信息
    @Override
    public void show() {
        System.out.println("通话套餐信息: 通话时间为: " + getTalkTime() + " 短信条数为: " + getMsgNumber() +" 月资费为: " + getRate());
    }

    @Override
    public void talk(int talkTime, PhoneCard phoneCard) {
        System.out.println("我就是想测试一下你的通话服务方法哦！");
    }
}
