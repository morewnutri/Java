package com.lagou.library;

/**
 * 编程实现将通话套餐类和上网套餐类中相同的特征和行为提取出来组成抽象套餐类的封装
 */

public abstract class AbstractPackage {
    // 1.私有化成员变量，使用private关键字修饰
    private double rate; // 用于描述每月资费的成员变量

    // 3.在构造方法中调用set方法实现合理值的判断
    public AbstractPackage() {
    }

    public AbstractPackage(double rate) {
        setRate(rate);
    }

    // 2.提供公有的get和set方法，并在方法体中进行合理值的判断
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        if (rate >= 0) {
            this.rate = rate;
        } else {
            System.out.println("每月资费不合理哦！！！");
        }
    }

    // 4.提供显示所有套餐信息的抽象方法
    public abstract void show();
}
