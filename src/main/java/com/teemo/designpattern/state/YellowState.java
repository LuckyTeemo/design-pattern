package com.teemo.designpattern.state;

/**
 *
 * @author Teemo
 * @date 2023/3/20
 * 黄灯状态
 */
public class YellowState implements TrafficLightState{

    @Override
    public void switchToGreen(TrafficLight trafficLight) {
        System.out.println("转换为绿灯，持续60s");
        trafficLight.setTrafficLightState(new GreenState());
    }

    @Override
    public void switchToYellow(TrafficLight trafficLight) {
        System.out.println("当前为黄灯，无需转换");
    }

    @Override
    public void switchToRed(TrafficLight trafficLight) {
        System.out.println("转换为红灯，持续5s");
        trafficLight.setTrafficLightState(new RedState());
    }
}
