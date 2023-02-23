package com.teemo.designpattern.decorator;

/**
 *
 * @author Teemo
 * @date 2023/2/23
 * 天气服务的抽象装饰类 用来扩展天气服务的具体实现类的功能
 */
public abstract class WeatherServiceDecorator implements WeatherService{

    private WeatherService weatherService;

    public WeatherServiceDecorator(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @Override
    public String queryWeather(String code) {
        return weatherService.queryWeather(code);
    }
}
