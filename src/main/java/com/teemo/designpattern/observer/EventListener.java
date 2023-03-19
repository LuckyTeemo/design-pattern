package com.teemo.designpattern.observer;

/**
 *
 * @author Teemo
 * @date 2023/3/19
 * 事件监听接口  抽象的观察者接口
 */
public interface EventListener {

    /**
     * 不同的事件对通知消息进行处理
     * @param cost 通知消息
     */
    void doEvent(Cost cost);
}
