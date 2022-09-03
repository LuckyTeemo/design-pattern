package com.teemo.designpattern.proxy;

/**
 *
 * @author Teemo
 * @date 2022/9/1
 */
public class PlayerProxy implements DiabloThree{

    private Player player;

    public PlayerProxy(Player player) {
        this.player = player;
    }

    @Override
    public void getSuperEquipment() {

        checkUserCount();
        player.getSuperEquipment();
        recordGetSuperEquipmentDate();
    }

    private void checkUserCount() {

        System.out.println("检查下用户的装备刷不刷的动怪");
    }

    private void recordGetSuperEquipmentDate() {
        System.out.println("记录下时间 好知道平均多少年出一件太古");
    }
}
