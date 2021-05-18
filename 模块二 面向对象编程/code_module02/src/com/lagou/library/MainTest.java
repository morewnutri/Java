package com.lagou.library;

/**
 * 编程实现各种类库的测试
 */
public class MainTest {

    public static void main(String[] args) {

        // 1.声明PhoneCard类型的引用指向PhoneCard类型的对象作为下面方法的实参
        PhoneCard phoneCard = new PhoneCard();

        // 2.声明NetService类型的引用指向NetPackage类型的对象，也就是接口引用指向实现类对象从而形成了多态
        NetService netService = new NetPackageServiceImpl();
        netService.net(66, phoneCard);

        System.out.println("---------------------------------------------------");
        // 3.声明TalkService类型的引用指向TalkPackage类型的对象，也就是接口引用指向实现类对象从而形成了多态
        TalkService talkService = new TalkPackageServiceImpl();
        talkService.talk(66, phoneCard);

        System.out.println("---------------------------------------------------");
        // 4.声明AbstractPackage类型的引用指向NetPackage类型的对象，也就是抽象类引用指向自雷的对象从而形成了多态
        AbstractPackage abstractPackage = new NetPackageServiceImpl(5, 30);
        abstractPackage.show();
    }
}
