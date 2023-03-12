package com.teemo.designpattern.adapter.classadapter;

/**
 *
 * @author Teemo
 * @date 2023/3/1
 * 已经在线上提供天气查询的服务 线上通过这个服务的方法获取天气信息
 */
public interface CompanyGirlWeatherService {

    /**
     * Girl公司查询天气的方法
     * @param longitude 经度
     * @param latitude 纬度
     * @return Girl公司的天气返回
     */
    GirlWeather queryGirlWeather(String longitude, String latitude);
}
