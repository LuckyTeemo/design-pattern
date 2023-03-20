package com.teemo.designpattern.state;

/**
 *
 * @author Teemo
 * @date 2023/3/20
 * 交通灯类  为状态模式结构图中的上下文
 * 持有状态抽象类/接口 并提供set方法
 */
public class TrafficLight {

    /**
     * 初始化为绿灯
     */
    private TrafficLightState trafficLightState = new GreenState();

    public void setTrafficLightState(TrafficLightState trafficLightState) {
        this.trafficLightState = trafficLightState;
    }

    public void switchToGreen() {
        trafficLightState.switchToGreen(this);
    }

    public void switchToRed() {
        trafficLightState.switchToRed(this);
    }

    public void switchToYellow() {
        trafficLightState.switchToYellow(this);
    }
}
