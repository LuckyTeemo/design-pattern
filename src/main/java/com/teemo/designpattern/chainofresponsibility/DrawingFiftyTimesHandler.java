package com.teemo.designpattern.chainofresponsibility;

/**
 * 抽五十次
 * @author Teemo
 * @date 2023/2/6
 */
public class DrawingFiftyTimesHandler extends RewardHandler{

    public DrawingFiftyTimesHandler(RewardHandler rewardHandler) {
        super(rewardHandler);
    }

    @Override
    public void rewardHero(RequestCards requestCards) {

        if (requestCards.getCardDrawingTimes() >= 50) {
            System.out.println("抽奖次数已满50，奖励S级英雄一个，加把劲抽够100再给你个SS级英雄");
            super.rewardHero(requestCards);
        }else {
            System.out.println("轻氪用户，稍微关注");
        }
    }
}
