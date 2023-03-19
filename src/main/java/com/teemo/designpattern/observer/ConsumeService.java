package com.teemo.designpattern.observer;

import java.math.BigDecimal;

/**
 *
 * @author Teemo
 * @date 2023/3/19
 * 消费服务
 */
public abstract class ConsumeService {

    /**
     * 初始化两个事件观察者集合
     */
    private final EventManager eventManager;

    public ConsumeService() {

        /**
         * 初始化两个事件观察者集合
         */
        eventManager = new EventManager(EventManager.EventEnum.MESSAGE, EventManager.EventEnum.APP);
        // 添加观察者
        eventManager.subscribe(EventManager.EventEnum.MESSAGE, new MessageListener());
        eventManager.subscribe(EventManager.EventEnum.APP, new AppListener());
    }

    /**
     * 具体的子类只需要关系自己的业务逻辑，对于与子类主要逻辑无关的 通过父类处理
     * @param consumeMoney 消费金额
     */
    public void sendNotice(BigDecimal consumeMoney) {

        Cost cost = consume(consumeMoney);
        eventManager.notify(EventManager.EventEnum.MESSAGE, cost);
        eventManager.notify(EventManager.EventEnum.APP, cost);
    }

    /**
     * 消费方法
     * @param consumeMoney 消费金额
     * @return 消费的信息
     */
    public abstract Cost consume(BigDecimal consumeMoney);
}
