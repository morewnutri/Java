package com.lagou.library;

/**
 * 编程实现通话服务接口
 */
public interface TalkService {
    // 自定义抽象方法描述通话服务的功能
    public abstract void talk(int talkTime, PhoneCard phoneCard);
}
