package com.teemo.designpattern.proxy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Proxy;

@SpringBootTest
public class ProxyTest {

    @Test
    public void test() {

        // 我在刷
        Player player = new Player();
        player.getSuperEquipment();
        // 刷不动了 找代练
        PlayerProxy playerProxy = new PlayerProxy(player);
        // 代练刷
        playerProxy.getSuperEquipment();
    }

    @Test
    public void DynamicProxyTest() {

        // 真实玩家
        Player player = new Player();
        // 代理类定义的代理方法
        CheckPlayerAccountInvocationHandler<Player> usePlayerAccountInvocationHandler = new CheckPlayerAccountInvocationHandler<>(player);
        DiabloThree proxy = (DiabloThree) Proxy.newProxyInstance(player.getClass().getClassLoader(), new Class<?>[]{DiabloThree.class}, usePlayerAccountInvocationHandler);
        proxy.getSuperEquipment();

    }
}
