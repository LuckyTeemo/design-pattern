package com.teemo.designpattern.singleton.lazy;

/**
 *
 * @author Teemo
 * @date 2022/6/29
 * 单例模式-懒汉式-同步方法
 */
public class LazySingletonSyn {

    private static LazySingletonSyn instance;

    private LazySingletonSyn () {}

    public static synchronized LazySingletonSyn getInstance() {

        if (instance == null) {
            instance = new LazySingletonSyn();
        }
        return instance;
    }
}
