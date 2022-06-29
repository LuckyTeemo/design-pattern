package com.teemo.designpattern.singleton.hungry;

/**
 *
 * @author Teemo
 * @date 2022/6/29
 * 单例模式-饿汉式-静态常量
 */
public class HungrySingletonStaticConst {

    public static final HungrySingletonStaticConst INSTANCE = new HungrySingletonStaticConst();

    private HungrySingletonStaticConst() {}

    public static HungrySingletonStaticConst getInstance() {
        return INSTANCE;
    }
}
