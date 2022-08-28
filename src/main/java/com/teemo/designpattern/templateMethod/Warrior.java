package com.teemo.designpattern.templateMethod;

/**
 *
 * @author Teemo
 * @date 2022/8/21
 */
public class Warrior extends BattleBoss{

    @Override
    protected void moveBoss() {
        System.out.println("使用野蛮冲锋移动到boss");
    }

    @Override
    protected void releaseSkills() {
        System.out.println("释放万剑归宗技能");
    }

    @Override
    protected void getEquip() {
        System.out.println("获取渴血战斧装备");
    }
}
