package com.teemo.designpattern.chainofresponsibility;

import lombok.AllArgsConstructor;

import java.util.Objects;

/**
 *
 * @author Teemo
 * @date 2023/2/6
 */
@AllArgsConstructor
public abstract class RewardHandler {

    private final RewardHandler next;

    public void rewardHero(RequestCards requestCards) {

        if (Objects.nonNull(next)) {
            next.rewardHero(requestCards);
        }
    }
}
