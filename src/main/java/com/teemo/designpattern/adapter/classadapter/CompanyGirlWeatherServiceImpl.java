package com.teemo.designpattern.adapter.classadapter;

/**
 *
 * @author Teemo
 * @date 2023/3/1
 * 获取天气信息的具体实现
 */
public class CompanyGirlWeatherServiceImpl implements CompanyGirlWeatherService {

    @Override
    public GirlWeather queryGirlWeather(String longitude, String latitude) {

        GirlWeather girlWeather = new GirlWeather();
        girlWeather.setTemperature("18");
        girlWeather.setWeatherType("晴");
        girlWeather.setLongitude(longitude);
        girlWeather.setLatitude(latitude);
        return girlWeather;
    }
}
