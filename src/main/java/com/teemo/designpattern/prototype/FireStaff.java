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
public class FireStaff extends Staff{

    private final String name;

    private final String passiveSkill;

    private Integer damage;

    public FireStaff(FireStaff fireStaff, Integer damage) {
        super(fireStaff);
        this.name = fireStaff.name;
        this.passiveSkill = fireStaff.passiveSkill;
        this.damage = damage;
    }

    @Override
    public FireStaff copy(Integer damage) {
        return new FireStaff(this, damage);
    }
}
