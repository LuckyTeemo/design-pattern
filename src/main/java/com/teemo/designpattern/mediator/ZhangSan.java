package com.teemo.designpattern.mediator;

/**
 *
 * @author Teemo
 * @date 2022/10/24
 */
public class ZhangSan extends Player{

    public ZhangSan(String name, ChatMediator chatMediator) {
        super(name, chatMediator);
    }

    public void chat(String message) {
        chatMediator.chat(message, this);
    }

    public void getMessage(String message) {
        System.out.println("zhangSan 获取到的消息是" + message);
    }
}
