package com.teemo.designpattern.strategy.service.impl;

import com.teemo.designpattern.strategy.service.NoticeStrategy;
import org.springframework.stereotype.Service;

/**
 *
 * @author Teemo
 * @date 2022/6/29
 * 邮件方式通知
 */
@Service
public class Email implements NoticeStrategy {

    @Override
    public void notice(String noticeMessage) {
        System.out.println("邮件通知:" + noticeMessage);
    }
}
