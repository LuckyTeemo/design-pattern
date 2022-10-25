package com.teemo.designpattern.mediator;

/**
 *
 * @author Teemo
 * @date 2022/10/24
 * 抽象中介类
 */
public abstract class ChatMediator {

    /**
     * 聊天
     * @param message 消息
     * @param player 玩家
     */
    public abstract void chat(String message, Player player);

}
