package com.teemo.designpattern.proxy;

/**
 *
 * @author Teemo
 * @date 2022/9/1
 */
public class Player implements DiabloThree{

    @Override
    public void getSuperEquipment() {
        System.out.println("不出太古不睡觉");
    }
}
