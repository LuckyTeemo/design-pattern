package com.teemo.designpattern.command;

/**
 *
 * @author Teemo
 * @date 2022/11/1
 */

public class Thieves extends Profession{

    @Override
    public void changeTargetAttribute(Target target) {
        System.out.println("变化前属性" + target.getVisibility().name());
        target.setVisibility(target.getVisibility() == VisibilityEnum.VISIBLE ? VisibilityEnum.INVISIBLE : VisibilityEnum.VISIBLE);
        System.out.println("变化后属性" + target.getVisibility().name());
    }
}
