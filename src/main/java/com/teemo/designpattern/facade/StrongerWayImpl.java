package com.teemo.designpattern.facade;

/**
 * @author Teemo
 * @date 2022/8/10
 */
public class StrongerWayImpl implements StrongerWay {

    @Override
    public void upgrade() {
        System.out.println("打怪升级");
    }

    @Override
    public void refineEquip() {
        System.out.println("精炼装备");
    }

    @Override
    public void capturePet() {
        System.out.println("抓宝宝");
    }

    @Override
    public void getTitle() {
        System.out.println("获取称号");
    }
}
