package com.teemo.designpattern.strategy.service.impl;

import com.teemo.designpattern.strategy.service.NoticeStrategy;

/**
 *
 * @author Teemo
 * @date 2022/6/29
 * 短信通知
 */
public class Message implements NoticeStrategy {

    @Override
    public void notice(String noticeMessage) {
        System.out.println("短信通知:" + noticeMessage);
    }
}
