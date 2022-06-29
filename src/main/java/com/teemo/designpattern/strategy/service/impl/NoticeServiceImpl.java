package com.teemo.designpattern.strategy.service.impl;

import com.teemo.designpattern.strategy.context.StrategyContext;
import com.teemo.designpattern.strategy.model.NoticeDAO;
import com.teemo.designpattern.strategy.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Teemo
 * @date 2022/6/29
 */
@Service
public class NoticeServiceImpl implements NoticeService {

    @Autowired
    private StrategyContext strategyContext;

    @Override
    public String notice(NoticeDAO noticeDao) {

        strategyContext.exec(noticeDao.getNoticeType(), noticeDao.getNoticeContent());
        return noticeDao.getNoticeType() + "success";
    }
}
