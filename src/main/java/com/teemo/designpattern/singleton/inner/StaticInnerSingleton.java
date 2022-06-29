package com.teemo.designpattern.singleton.inner;

/**
 *
 * @author Teemo
 * @date 2022/6/29
 * 单例模式-静态内部类
 * 实现了懒加载 且jvm保证线程安全
 */
public class StaticInnerSingleton {

    private StaticInnerSingleton() {}

    static class StaticInner {
        public static final StaticInnerSingleton INSTANCE = new StaticInnerSingleton();
    }

    public static StaticInnerSingleton getInstance() {
        return StaticInner.INSTANCE;
    }
}
