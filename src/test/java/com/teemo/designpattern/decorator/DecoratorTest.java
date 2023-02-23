package com.teemo.designpattern.decorator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DecoratorTest {

    @Test
    public void test() {

        // 使用普通地查询天气方法
        WeatherService weatherService = new WeatherServiceImpl();
        System.out.println(weatherService.queryWeather("2"));

        // 使用只查询城市的装饰类查询天气
        CityWeatherDecorator cityWeatherDecorator = new CityWeatherDecorator(weatherService);
        System.out.println(cityWeatherDecorator.queryWeather("2"));
    }
}
