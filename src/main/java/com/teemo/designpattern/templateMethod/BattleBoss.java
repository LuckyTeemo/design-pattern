package com.teemo.designpattern.templateMethod;

/**
 * @author Teemo
 * @date 2022/8/21
 * boss战
 */
public abstract class BattleBoss {

    /**
     * 移动到boss
     */
    protected abstract void moveBoss();

    /**
     * 释放技能
     */
    protected abstract void releaseSkills();

    /**
     * boss爆装备
     */
    protected abstract void getEquip();

    /**
     * 加上final 防止恶意操作 不允许子类覆写
     */
    public final void attackBoss() {
        moveBoss();
        releaseSkills();
        getEquip();
    }
}
