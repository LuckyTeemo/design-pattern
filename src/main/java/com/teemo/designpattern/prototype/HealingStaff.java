package com.teemo.designpattern.prototype;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 *
 * @author Teemo
 * @date 2022/9/8
 */
@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
@ToString
public class HealingStaff extends Staff{

    private String name;

    private String passiveSkill;

    private Integer damage;

    public HealingStaff(HealingStaff healingStaff, Integer damage) {
        super(healingStaff);
        this.name = healingStaff.name;
        this.passiveSkill = healingStaff.passiveSkill;
        this.damage = damage;
    }

    @Override
    public HealingStaff copy(Integer damage) {
        return new HealingStaff(this, damage);
    }
}
