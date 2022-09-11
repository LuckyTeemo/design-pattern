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
public class DarkSword extends Sword{

    private final String name;

    private final String passiveSkill;

    private Integer damage;

    public DarkSword(DarkSword darkSword, Integer damage) {
        super(darkSword);
        this.name = darkSword.name;
        this.passiveSkill = darkSword.passiveSkill;
        this.damage = damage;
    }

    @Override
    public DarkSword copy(Integer damage) {
        return new DarkSword(this, damage);
    }


}
