package com.teemo.designpattern.decorator;

/**
 *
 * @author Teemo
 * @date 2023/2/23
 * 具体地装饰实现类 原来地查天气的方法是通过任何code查询 这个装饰要求只能查市区的天气信息
 */
public class CityWeatherDecorator extends WeatherServiceDecorator{

    public CityWeatherDecorator(WeatherService weatherService) {
        super(weatherService);
    }

    @Override
    public String queryWeather(String code) {

        // 在这里要把code进行转换  如果是区县的code要转换成市的code
        if (WeatherServiceImpl.CITY_AREA_CODE.equals(code)) {
            code = WeatherServiceImpl.CITY_CODE;
        }
        return super.queryWeather(code);
    }
}
