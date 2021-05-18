package com.lagou.library;

/**
 * 编程实现上网套餐类的封装
 */
public class NetPackageServiceImpl extends AbstractPackage implements NetService {
    // 1.私有化成员变量，使用private关键字修饰
    private double netFlow;  // 用于描述上网流量的成员变量

    // 3.在构造方法中调用set方法进行合理值的判断
    public NetPackageServiceImpl() {
    }
    public NetPackageServiceImpl(double rate, double netFlow) {
        super(rate);
        setNetFlow(netFlow);
    }

    // 2.提供公有的get和set方法，并在方法体中进行合理值的判断
    public double getNetFlow() {
        return netFlow;
    }

    public void setNetFlow(double netFlow) {
        if (netFlow >= 0) {
            this.netFlow = netFlow;
        } else {
            System.out.println("上网流量信息不合理哦...");
        }
    }

    // 4.显示所有套餐信息
    @Override
    public void show() {
        System.out.println("上网套餐信息: 上网流量为: " + getNetFlow() + " 月资费为: " + getRate());
    }

    @Override
    public void net(double netFlow, PhoneCard phoneCard) {
        System.out.println("我就是想测试一下你的上网服务方法哦！");
    }
}
