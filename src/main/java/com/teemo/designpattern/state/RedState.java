package com.teemo.designpattern.state;

/**
 *
 * @author Teemo
 * @date 2023/3/20
 * 红灯状态
 */
public class RedState implements TrafficLightState{

    @Override
    public void switchToGreen(TrafficLight trafficLight) {
        System.out.println("无法转换为绿灯");
    }

    @Override
    public void switchToYellow(TrafficLight trafficLight) {
        System.out.println("转换为黄灯，持续10s");
        trafficLight.setTrafficLightState(new YellowState());
    }

    @Override
    public void switchToRed(TrafficLight trafficLight) {
        System.out.println("当前为红灯，无需转换");
    }
}
