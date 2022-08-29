package com.teemo.designpattern.builder;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class BuilderTest {

    @Test
    public void test() {

        // 我想要一个莽夫
        Protagonist simpleMindedPerson = new Protagonist.Builder("莽夫", new BigDecimal("2.50"), SkinColor.BLACK)
                // 辅助技能只点统御 增加带兵数量
                .setAuxiliaryValue(0, 0, 10)
                // 攻击技能只点力量
                .setAttackValue(10, 0, 0)
                .withWeapon(Weapon.TWO_HANDED_SWORD).build();
        System.out.println(simpleMindedPerson.toString());

        // 我想要一个弓箭手
        Protagonist archer = new Protagonist.Builder("罗宾", new BigDecimal("1.85"), SkinColor.WHITE)
                // 辅助技能只点魅力
                .setAuxiliaryValue(0, 10, 0)
                // 攻击技能点敏捷和幸运
                .setAttackValue(0, 5, 5)
                .withWeapon(Weapon.BOW_AND_ARROW).build();
        System.out.println(archer.toString());
    }
}
