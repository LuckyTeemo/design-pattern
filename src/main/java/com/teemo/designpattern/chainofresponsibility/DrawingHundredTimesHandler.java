package com.teemo.designpattern.chainofresponsibility;

/**
 * 抽100次
 * @author Teemo
 * @date 2023/2/6
 */
public class DrawingHundredTimesHandler extends RewardHandler{

    public DrawingHundredTimesHandler(RewardHandler rewardHandler) {
        super(rewardHandler);
    }

    @Override
    public void rewardHero(RequestCards requestCards) {

        if (requestCards.getCardDrawingTimes() >= 100) {
            System.out.println("抽奖次数已满100，奖励SS级英雄一个，这波不亏(*^_^*)");
        }else {
            System.out.println("氪金大佬，重点关注");
        }
    }
}
