package com.teemo.designpattern.prototype;

/**
 *
 * @author Teemo
 * @date 2022/9/7
 * 武器工厂 用于生产不同类型的武器
 */
public interface WeaponFactory {

    /**
     * 生产斧子
     * @return 斧子
     */
    Axe createAxe(Integer damage);

    /**
     * 生产剑
     * @return 剑
     */
    Sword createSword(Integer damage);

    /**
     * 生产法杖
     * @return 法杖
     */
    Staff createStaff(Integer damage);
}
