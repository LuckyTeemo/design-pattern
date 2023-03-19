package com.teemo.designpattern.observer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class ObserverTest {

    @Test
    public void test() {

        // 用户进行消费行为
        ConsumeService consumeServiceExtend = new ConsumeServiceExtend();
        // 告知观察者做响应
        consumeServiceExtend.sendNotice(new BigDecimal("8.88"));
    }
}
