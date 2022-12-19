package com.teemo.designpattern.command;

/**
 *
 * @author Teemo
 * @date 2022/10/31
 */
public class Mage extends Profession{

    @Override
    public void changeTargetAttribute(Target target) {
        System.out.println("原来的状态" + target.getSize().name());
        target.setSize(target.getSize() == SizeEnum.HUGE ? SizeEnum.SMALL : SizeEnum.NORMAL);
        System.out.println("改变后的状态" + target.getSize().name());
    }
}
