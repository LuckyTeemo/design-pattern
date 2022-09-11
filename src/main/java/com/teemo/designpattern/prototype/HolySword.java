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
public class HolySword extends Sword{

    private String name;

    private String passiveSkill;

    private Integer damage;

    public HolySword(HolySword holySword, Integer damage) {
        super(holySword);
        this.name = holySword.name;
        this.passiveSkill = holySword.passiveSkill;
        this.damage = damage;
    }

    @Override
    public HolySword copy(Integer damage) {
        return new HolySword(this, damage);
    }
}
