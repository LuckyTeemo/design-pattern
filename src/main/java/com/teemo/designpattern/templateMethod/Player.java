package com.teemo.designpattern.templateMethod;

/**
 *
 * @author Teemo
 * @date 2022/8/21
 * 玩家 操纵不同职业打boss
 */
public class Player {

    private BattleBoss battleBoss;

    public Player(BattleBoss battleBoss) {
        this.battleBoss = battleBoss;
    }

    public void attackBoss() {
        battleBoss.attackBoss();
    }

    public void changeProfession(BattleBoss battleBoss) {
        this.battleBoss = battleBoss;
    }
}
