package com.teemo.designpattern.strategy.service;

import com.teemo.designpattern.strategy.model.NoticeDAO;

/**
 *
 * @author Teemo
 * @date 2022/6/29
 */
public interface NoticeService {

    /**
     * 选择策略进行通知
     * @param noticeDao 通知请求参数
     * @return 通知结果
     */
    String notice(NoticeDAO noticeDao);
}
