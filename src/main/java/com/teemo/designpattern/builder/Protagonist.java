package com.teemo.designpattern.builder;

import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * @author Teemo
 * @date 2022/8/28
 * 建议当在创建复杂对象的时候引入建造者模式
 */
@Getter
@ToString
public final class Protagonist {

    private final String name;

    private final BigDecimal height;

    private final SkinColor skinColor;

    private final Integer medicine;

    private final Integer charm;

    private final Integer domination;

    private final Integer power;

    private final Integer agile;

    private final Integer luck;

    private final Weapon weapon;

    public Protagonist(Builder builder) {

        this.name = builder.name;
        this.height = builder.height;
        this.skinColor = builder.skinColor;
        this.medicine = builder.medicine;
        this.charm = builder.charm;
        this.domination = builder.domination;
        this.power = builder.power;
        this.agile = builder.agile;
        this.luck = builder.luck;
        this.weapon = builder.weapon;
    }

    public static class Builder {

        private final String name;

        private final BigDecimal height;

        private final SkinColor skinColor;

        private Integer medicine;

        private Integer charm;

        private Integer domination;

        private Integer power;

        private Integer agile;

        private Integer luck;

        private Weapon weapon;

        // 基础信息 必须设置 写在构造器里
        public Builder(String name, BigDecimal height, SkinColor skinColor) {

            if (name == null || height == null || skinColor == null) {
                throw new RuntimeException("base info not allowed null");
            }
            this.name = name;
            this.height = height;
            this.skinColor = skinColor;
        }

        // 辅助技能
        public Builder setAuxiliaryValue(Integer medicine, Integer charm, Integer domination) {

            if (medicine + charm + domination > 10) {
                throw new RuntimeException("辅助技能点数和不得超过10");
            }
            this.medicine = medicine;
            this.charm = charm;
            this.domination = domination;
            return this;
        }

        // 攻击技能
        public Builder setAttackValue(Integer power, Integer agile, Integer luck) {

            if (power + agile + luck > 10) {
                throw new RuntimeException("攻击技能点数和不得超过10");
            }
            this.power = power;
            this.agile = agile;
            this.luck = luck;
            return this;
        }

        // 武器
        public Builder withWeapon(Weapon weapon) {

            this.weapon = weapon;
            return this;
        }

        public Protagonist build() {
            return new Protagonist(this);
        }
    }
}
