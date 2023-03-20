package com.teemo.designpattern.state;

/**
 *
 * @author Teemo
 * @date 2023/3/20
 * 交通灯状态接口 定义交通信号灯转换方法
 */
public interface TrafficLightState {

    /**
     * 转绿灯
     * @param trafficLight 交通灯
     */
    void switchToGreen(TrafficLight trafficLight);

    /**
     * 转黄灯
     * @param trafficLight 交通灯
     */
    void switchToYellow(TrafficLight trafficLight);

    /**
     * 转红灯
     * @param trafficLight 交通灯
     */
    void switchToRed(TrafficLight trafficLight);
}
