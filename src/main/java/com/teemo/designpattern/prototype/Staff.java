package com.teemo.designpattern.prototype;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 * @author Teemo
 * @date 2022/9/7
 * 法杖抽象类
 * 实现原型接口
 */
@EqualsAndHashCode
@NoArgsConstructor
public abstract class Staff implements Prototype{

    public Staff(Staff staff) {

    }

    @Override
    public abstract Staff copy(Integer damage);
}
