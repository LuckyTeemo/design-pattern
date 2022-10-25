package com.teemo.designpattern.mediator;

/**
 *
 * @author Teemo
 * @date 2022/10/24
 * 抽象同事类
 */
public abstract class Player {

    protected String name;

    protected ChatMediator chatMediator;

    public Player(String name, ChatMediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
    }

}
