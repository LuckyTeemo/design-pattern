package com.teemo.designpattern.singleton.lazy;

/**
 *
 * @author Teemo
 * @date 2022/6/29
 * 单例模式-懒汉式-双重检查锁
 */
public class LazySingletonDcl {

    /**
     * volatile 禁止指令重排序 防止高并发情况下因为指令重排序导致半初始化实例被使用
     */
    private volatile static LazySingletonDcl instance;

    private LazySingletonDcl() {
    }

    public static LazySingletonDcl getInstance() {

        // 第一个null的判断:当实例生成时避免后续方法调用进入synchronized代码块
        if (instance == null) {
            synchronized (LazySingletonDcl.class) {
                // 第二个null的判断时因为第一个null的判断和synchronized不是原子性
                // 假设第一个线程进入第一个if后被第二个线程抢先一步抢了锁就会有问题
                if (instance == null) {
                    instance = new LazySingletonDcl();
                }
            }
        }
        return instance;
    }
}
