package com.teemo.designpattern.prototype;

import lombok.RequiredArgsConstructor;

/**
 *
 * @author Teemo
 * @date 2022/9/7
 */
@RequiredArgsConstructor
public class WeaponFactoryImpl implements WeaponFactory{

    private final Axe axe;

    private final Sword sword;

    private final Staff staff;

    @Override
    public Axe createAxe(Integer damage) {return axe.copy(damage);}

    @Override
    public Sword createSword(Integer damage) {
        return sword.copy(damage);
    }

    @Override
    public Staff createStaff(Integer damage) {
        return staff.copy(damage);
    }
}
