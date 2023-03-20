package com.teemo.designpattern.state;

/**
 *
 * @author Teemo
 * @date 2023/3/20
 * 绿灯状态
 */
public class GreenState implements TrafficLightState{

    @Override
    public void switchToGreen(TrafficLight trafficLight) {
        System.out.println("当前为绿灯，无需转换");
    }

    @Override
    public void switchToYellow(TrafficLight trafficLight) {
        System.out.println("转换为黄灯，持续10s");
        trafficLight.setTrafficLightState(new YellowState());
    }

    @Override
    public void switchToRed(TrafficLight trafficLight) {

    }
}
