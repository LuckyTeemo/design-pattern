package com.teemo.designpattern.state;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StateTest {

    @Test
    public void test() {

        // 有一个交通信号灯
        TrafficLight trafficLight = new TrafficLight();
        // 转绿灯
        trafficLight.switchToGreen();
        // 转黄灯
        trafficLight.switchToYellow();
        // 转红灯
        trafficLight.switchToRed();
        // 再转绿灯
        trafficLight.switchToGreen();
    }
}
