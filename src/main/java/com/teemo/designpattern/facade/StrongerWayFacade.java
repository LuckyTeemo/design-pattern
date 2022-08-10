package com.teemo.designpattern.facade;

/**
 * @author Teemo
 * @date 2022/8/10
 * 门面类 帮我变强
 */
public class StrongerWayFacade {

    StrongerWay strongerWay = new StrongerWayImpl();

    public void beStrong() {

        strongerWay.upgrade();
        strongerWay.refineEquip();
        strongerWay.capturePet();
        strongerWay.getTitle();
    }
}
