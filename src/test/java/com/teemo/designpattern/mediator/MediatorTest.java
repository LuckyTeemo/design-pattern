package com.teemo.designpattern.mediator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MediatorTest {

    @Test
    public void test() {

        ChatWindow chatWindow = new ChatWindow();

        ZhangSan zhangSan = new ZhangSan("张三", chatWindow);
        LiSi liSi = new LiSi("李四", chatWindow);
        WangWu wangWu = new WangWu("王五", chatWindow);

        chatWindow.setZhangSan(zhangSan);
        chatWindow.setLiSi(liSi);
        chatWindow.setWangWu(wangWu);

        zhangSan.chat("上线上线");
        liSi.chat("我上单");
        wangWu.chat("我打野");
    }
}
