package com.teemo.designpattern.observer;

import java.math.BigDecimal;

/**
 *
 * @author Teemo
 * @date 2023/3/19
 * 余额变动后的具体通知内容
 */
public class Cost {

    /**
     * 消费金额
     */
    private BigDecimal consumeMoney;

    /**
     * 消费时间
     */
    private String consumeTime;

    public BigDecimal getConsumeMoney() {
        return consumeMoney;
    }

    public void setConsumeMoney(BigDecimal consumeMoney) {
        this.consumeMoney = consumeMoney;
    }

    public String getConsumeTime() {
        return consumeTime;
    }

    public void setConsumeTime(String consumeTime) {
        this.consumeTime = consumeTime;
    }
}
