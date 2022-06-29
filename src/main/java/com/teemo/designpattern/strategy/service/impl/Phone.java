package com.teemo.designpattern.strategy.service.impl;

import com.teemo.designpattern.strategy.service.NoticeStrategy;

/**
 *
 * @author Teemo
 * @date 2022/6/29
 * 电话通知
 */
public class Phone implements NoticeStrategy {

    @Override
    public void notice(String noticeMessage) {
        System.out.println("电话通知:" + noticeMessage);
    }
}
