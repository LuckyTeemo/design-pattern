package com.teemo.designpattern.prototype;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 * @author Teemo
 * @date 2022/9/7
 * 剑武器的抽象 实现原型接口
 * 继承类实现对象拷贝方法
 */
@EqualsAndHashCode
@NoArgsConstructor
public abstract class Sword implements Prototype{

    public Sword(Sword sword){

    }

    @Override
    public abstract Sword copy(Integer damage);
}
