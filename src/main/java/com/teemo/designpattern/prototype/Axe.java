package com.teemo.designpattern.prototype;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 * @author Teemo
 * @date 2022/9/7
 * 斧子的抽象类
 * 实现原型接口
 */
@EqualsAndHashCode
@NoArgsConstructor
public abstract class Axe implements Prototype {

    public Axe(Axe axe) {}

    @Override
    public abstract Axe copy(Integer damage);
}
