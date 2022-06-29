package com.teemo.designpattern.singleton.hungry;

/**
 *
 * @author Teemo
 * @date 2022/6/29
 * 单例模式-饿汉式-静态代码块
 */
public class HungrySingletonStaticBlock {

    public static final HungrySingletonStaticBlock INSTANCE;

    static {
        INSTANCE = new HungrySingletonStaticBlock();
    }

    private HungrySingletonStaticBlock() {}

    public static HungrySingletonStaticBlock getInstance() {
        return INSTANCE;
    }

}
