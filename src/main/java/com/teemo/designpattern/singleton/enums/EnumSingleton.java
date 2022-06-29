package com.teemo.designpattern.singleton.enums;

/**
 *
 * @author Teemo
 * @date 2022/6/29
 * 单例模式-枚举
 */
public class EnumSingleton {

    private EnumSingleton () {}

    enum Singleton {

        /**
         * 单例枚举
         */
        INSTANCE;

        private final EnumSingleton instance;

        Singleton() {
            instance = new EnumSingleton();
        }

        public EnumSingleton getInstance() {
            return instance;
        }
    }

    public static EnumSingleton getInstance() {
        return Singleton.INSTANCE.getInstance();
    }
}
