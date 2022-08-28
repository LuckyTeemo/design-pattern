package com.teemo.designpattern.templateMethod;

/**
 *
 * @author Teemo
 * @date 2022/8/21
 */
public class Mage extends BattleBoss{

    @Override
    protected void moveBoss() {
        System.out.println("使用传送魔法移动到boss");
    }

    @Override
    protected void releaseSkills() {
        System.out.println("释放烈焰风暴攻击boss");
    }

    @Override
    protected void getEquip() {
        System.out.println("获取降魔法杖");
    }
}
