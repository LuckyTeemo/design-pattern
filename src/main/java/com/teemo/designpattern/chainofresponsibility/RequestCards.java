package com.teemo.designpattern.chainofresponsibility;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 抽卡请求
 * @author Teemo
 * @date 2023/2/6
 */
@Data
@AllArgsConstructor
public class RequestCards {

    /**
     * 抽卡次数
     */
    private Integer cardDrawingTimes;

}
