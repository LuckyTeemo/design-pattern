package com.teemo.designpattern.strategy.model;

import lombok.Data;

/**
 *
 * @author Teemo
 * @date 2022/6/29
 */
@Data
public class NoticeDAO {

    /**
     * 通知类型
     */
    private String noticeType;

    /**
     * 通知内容
     */
    private String noticeContent;
}
