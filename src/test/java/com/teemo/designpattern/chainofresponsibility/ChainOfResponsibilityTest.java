package com.teemo.designpattern.chainofresponsibility;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author Teemo
 * @date 2023/2/6
 */
@SpringBootTest
public class ChainOfResponsibilityTest {

    @Test
    public void test() {
        // 韭菜玩家 准备大抽一波 奖励拉满
        LeekPlayer leekPlayer = new LeekPlayer();
        // 直接100抽
        RequestCards requestCards = new RequestCards(12);
        // 开抽
        leekPlayer.DrawCardsUntilNoMoney(requestCards);

    }
}
