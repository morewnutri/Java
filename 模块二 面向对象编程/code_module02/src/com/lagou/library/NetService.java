package com.lagou.library;

/**
 * 编程实现上网服务接口
 */
public interface NetService {
    // 自定义抽象方法描述上网服务的功能
    public abstract void net(double netFlow, PhoneCard phoneCard);
}
