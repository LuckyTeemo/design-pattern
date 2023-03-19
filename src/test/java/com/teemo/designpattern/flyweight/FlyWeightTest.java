package com.teemo.designpattern.flyweight;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FlyWeightTest {

    @Test
    public void test() {

        // 创建白色棋子
        GoFlyweightFactory goFlyweightFactory = GoFlyweightFactory.getInstance();
        // 先下一个白棋 走横七竖八
        new Thread(() -> {
            GoFlyWeight whiteA = goFlyweightFactory.createGoFlyWeight("白色", "横七竖八");
            // 展示棋子位置
            whiteA.showPosition();
        }).start();
        new Thread(() -> {
            // 再下一个白棋 走横二竖三 这两个棋子用的其实是一个实例 大大减少了内存的开销
            GoFlyWeight whiteB= goFlyweightFactory.createGoFlyWeight("白色", "横二竖三");
            whiteB.showPosition();
        }).start();

    }
}
