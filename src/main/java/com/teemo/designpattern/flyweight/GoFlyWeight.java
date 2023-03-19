package com.teemo.designpattern.flyweight;

/**
 *
 * @author Teemo
 * @date 2023/3/12
 * 抽象围棋享元类 定义公共的方法
 */
public abstract class GoFlyWeight {

    /**
     * 获取棋子颜色
     * @return 棋子颜色
     */
    public abstract String getColor();

    /**
     * 获取棋子位置
     * @return 棋子位置
     */
    public abstract String getPosition();

    public void showPosition() {
        System.out.println(getColor() + "棋的位置为" + getPosition());
    }

    /**
     * 内部状态 不会随环境变化而变化 通过此方法设置
     * @param position 位置
     */
    public abstract void fillPosition(String position);
}
