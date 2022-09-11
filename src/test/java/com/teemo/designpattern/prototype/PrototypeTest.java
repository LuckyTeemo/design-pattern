package com.teemo.designpattern.prototype;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

@SpringBootTest
public class PrototypeTest {

    @Test
    public void test() {

        // 通过工厂先创建原型对象
        WeaponFactory weaponFactory = new WeaponFactoryImpl(new CopperAxe("铜斧", "流血效果"),
                new DarkSword("黑暗之剑", "造成伤害提高2倍,收到伤害提高2倍"),
                new FireStaff("火焰法杖", "火焰伤害提高100%"));

        // 拷贝原型对象 创建多把不同伤害值的武器
        for (int i = 0; i < 3; i++) {
            Axe axe = weaponFactory.createAxe(new Random().nextInt(10));
            Sword sword = weaponFactory.createSword(new Random().nextInt(20));
            Staff staff = weaponFactory.createStaff(new Random().nextInt(30));
            System.out.println( i + "------" + axe);
            System.out.println( i + "------" + sword);
            System.out.println( i + "------" + staff);
        }



    }
}
