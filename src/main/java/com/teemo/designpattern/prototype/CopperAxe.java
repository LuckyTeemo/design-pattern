package com.teemo.designpattern.prototype;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 *
 * @author Teemo
 * @date 2022/9/7
 */
@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
@ToString
public class CopperAxe extends Axe{

    private final String name;

    private final String passiveSkill;

    private Integer damage;

    public CopperAxe(CopperAxe copperAxe, Integer damage) {
        super(copperAxe);
        this.name = copperAxe.name;
        this.passiveSkill = copperAxe.passiveSkill;
        this.damage = damage;
    }


    @Override
    public CopperAxe copy(Integer damage) {
        return new CopperAxe(this, damage);
    }
}
