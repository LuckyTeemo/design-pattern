package com.teemo.designpattern.strategy.context;

import com.teemo.designpattern.strategy.service.NoticeStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Teemo
 * @date 2022/6/29
 * 封装策略算法 供上层模块调用 解耦
 */
@Component
public class StrategyContext {

    @Autowired
    private final Map<String, NoticeStrategy> noticeStrategyMap = new ConcurrentHashMap<>();

    public void exec(String serviceType, String noticeContent) {

        // 根据服务类型拿到具体策略
        NoticeStrategy noticeStrategy = noticeStrategyMap.get(serviceType);
        if (ObjectUtils.isEmpty(noticeStrategy)) {
            throw new IllegalArgumentException("no such " + serviceType + "noticeService");
        }
        noticeStrategy.notice(noticeContent);
    }
}
