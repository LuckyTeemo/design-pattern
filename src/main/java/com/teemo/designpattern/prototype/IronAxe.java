package com.teemo.designpattern.prototype;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 *
 * @author Teemo
 * @date 2022/9/8
 */
@EqualsAndHashCode
@RequiredArgsConstructor
@ToString
public class IronAxe extends Axe{

    private String name;

    private String passiveSkill;

    private Integer damage;

    public IronAxe(IronAxe ironAxe, Integer damage) {
        super(ironAxe);
        this.name = ironAxe.name;
        this.passiveSkill = ironAxe.passiveSkill;
        this.damage = damage;
    }

    @Override
    public IronAxe copy(Integer damage) {
        return new IronAxe(this, damage);
    }
}
