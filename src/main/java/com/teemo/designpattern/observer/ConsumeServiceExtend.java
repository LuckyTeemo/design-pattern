package com.teemo.designpattern.observer;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Teemo
 * @date 2023/3/19
 * 消费服务实现类
 */
public class ConsumeServiceExtend extends ConsumeService{

    @Override
    public Cost consume(BigDecimal cost) {
        Cost money = new Cost();
        money.setConsumeMoney(cost);
        money.setConsumeTime(new Date().toString());
        return money;
    }
}
