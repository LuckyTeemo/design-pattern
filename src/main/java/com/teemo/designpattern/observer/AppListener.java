package com.teemo.designpattern.observer;

/**
 *
 * @author Teemo
 * @date 2023/3/19
 * app监听类 进行app的余额变动提醒
 */
public class AppListener implements EventListener{

    @Override
    public void doEvent(Cost cost) {
        System.out.println("XX银行App提醒，您本次消费金额" + cost.getConsumeMoney() + "消费时间为" + cost.getConsumeTime());
    }
}
