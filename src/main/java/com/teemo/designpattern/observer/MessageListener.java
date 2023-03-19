package com.teemo.designpattern.observer;

/**
 *
 * @author Teemo
 * @date 2023/3/19
 * 短信观察者类 当余额变动时 进行短信的通知
 */
public class MessageListener implements EventListener{

    @Override
    public void doEvent(Cost cost) {
        System.out.println("尊敬的XX银行用户，您于" + cost.getConsumeTime() + "消费金额" + cost.getConsumeMoney());
    }
}
