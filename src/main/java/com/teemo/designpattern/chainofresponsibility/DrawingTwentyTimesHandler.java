package com.teemo.designpattern.chainofresponsibility;

/**
 * 抽二十次
 * @author Teemo
 * @date 2023/2/6
 */
public class DrawingTwentyTimesHandler extends RewardHandler{

    public DrawingTwentyTimesHandler(RewardHandler rewardHandler) {
        super(rewardHandler);
    }

    @Override
    public void rewardHero(RequestCards requestCards) {
        if (requestCards.getCardDrawingTimes() >= 20) {
            System.out.println("抽卡次数已满二十，奖励A级英雄一个，加把劲抽够50，再给你个S级英雄");
            super.rewardHero(requestCards);
        }else {
            System.out.println("零氪玩家");
        }
    }
}
