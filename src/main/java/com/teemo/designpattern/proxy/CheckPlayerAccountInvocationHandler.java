package com.teemo.designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *
 * @author Teemo
 * @date 2022/9/1
 * 使用玩家账号刷装备的代练
 */
public class CheckPlayerAccountInvocationHandler<T> implements InvocationHandler {

    T target;

    public CheckPlayerAccountInvocationHandler(T target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        checkUserCount();
        Object o = method.invoke(target, args);
        recordGetSuperEquipmentDate();
        return o;
    }

    private void checkUserCount() {

        System.out.println("检查下用户的装备刷不刷的动怪");
    }

    private void recordGetSuperEquipmentDate() {
        System.out.println("记录下时间 好知道平均多少年出一件太古");
    }
}
