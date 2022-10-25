package com.teemo.designpattern.mediator;

/**
 *
 * @author Teemo
 * @date 2022/10/24
 */
public class WangWu extends Player{

    public WangWu(String name, ChatMediator chatMediator) {
        super(name, chatMediator);
    }

    public void chat(String message) {
        chatMediator.chat(message, this);
    }

    public void getMessage(String message) {
        System.out.println("wangWu 获取到的消息是" + message);
    }
}
