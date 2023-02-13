package com.teemo.designpattern.chainofresponsibility;

/**
 *
 * @author Teemo
 * @date 2023/2/6
 */
public class LeekPlayer {

    private RewardHandler chain;

    public LeekPlayer() {
        buildChain();
    }

    private void buildChain() {
        chain = new DrawingTwentyTimesHandler(new DrawingFiftyTimesHandler(new DrawingHundredTimesHandler(null)));
    }

    public void DrawCardsUntilNoMoney(RequestCards requestCards) {
        chain.rewardHero(requestCards);
    }
}
