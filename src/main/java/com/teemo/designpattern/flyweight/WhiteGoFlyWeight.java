package com.teemo.designpattern.flyweight;

/**
 *
 * @author Teemo
 * @date 2023/3/12
 * 白棋实现类
 */
public class WhiteGoFlyWeight extends GoFlyWeight{

    public WhiteGoFlyWeight(String color) {
        this.color = color;
    }

    /**
     * 颜色 外部状态 会随着环境的改变而改变 不可以共享的状态 要求必须唯一 黑白棋的共同属性
     */
    private String color;

    /**
     * 位置 内部状态 不会随着环境的改变而改变 对象可共享出来的信息
     */
    private String position;

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public void fillPosition(String position) {
        this.position = position;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
