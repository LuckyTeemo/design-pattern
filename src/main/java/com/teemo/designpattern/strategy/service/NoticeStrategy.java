package com.teemo.designpattern.strategy.service;

/**
 *
 * @author Teemo
 * @date 2022/6/29
 * 策略模式接口
 */
public interface NoticeStrategy {

    /**
     * 各实现类实现自己的通知方法
     * @param noticeMessage 通知内容
     */
    void notice(String noticeMessage);
}
