package com.teemo.designpattern.command;

/**
 *
 * @author Teemo
 * @date 2022/10/31
 * 真正干活的角色
 */
public abstract class Profession {

    /**
     * 改变目标属性
     */
    public abstract void changeTargetAttribute(Target target);
}
