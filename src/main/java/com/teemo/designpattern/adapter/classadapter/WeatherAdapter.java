package com.teemo.designpattern.adapter.classadapter;

/**
 *
 * @author Teemo
 * @date 2023/3/1
 * 天气适配类 通过适配Boy公司查询到的天气信息对象映射到Girl公司的天气信息对象返回
 */
public class WeatherAdapter extends CompanyBoyWeatherServiceImpl implements CompanyGirlWeatherService{

    @Override
    public GirlWeather queryGirlWeather(String longitude, String latitude) {

        BoyWeather boyWeather = queryBoyWeather(longitude, latitude);
        GirlWeather girlWeather = new GirlWeather();
        girlWeather.setWeatherType(boyWeather.getWt());
        girlWeather.setTemperature(boyWeather.getTem());
        girlWeather.setLongitude(boyWeather.getLon());
        girlWeather.setLatitude(boyWeather.getLat());
        return girlWeather;
    }
}
