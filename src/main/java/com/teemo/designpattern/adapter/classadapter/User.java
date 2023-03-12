package com.teemo.designpattern.adapter.classadapter;

/**
 *
 * @author Teemo
 * @date 2023/3/1
 * 用户查询天气
 */
public class User {

    public GirlWeather queryWeather(CompanyGirlWeatherService girlWeatherService, String longitude, String latitude) {

        return girlWeatherService.queryGirlWeather(longitude, latitude);
    }
}
