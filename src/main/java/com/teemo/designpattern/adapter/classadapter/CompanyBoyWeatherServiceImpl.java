package com.teemo.designpattern.adapter.classadapter;

/**
 *
 * @author Teemo
 * @date 2023/3/1
 * Boy服务的天气查询方法
 */
public class CompanyBoyWeatherServiceImpl implements CompanyBoyWeatherService{

    @Override
    public BoyWeather queryBoyWeather(String lon, String lat) {

        BoyWeather boyWeather = new BoyWeather();
        boyWeather.setTem("22");
        boyWeather.setWt("多云");
        boyWeather.setLon(lon);
        boyWeather.setLat(lat);
        return boyWeather;
    }
}
