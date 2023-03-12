package com.teemo.designpattern.adapter.classadapter;

/**
 *
 * @author Teemo
 * @date 2023/3/1
 * 现在需要将新的提供天气查询的服务引入，并且按照需要按照新的Boy服务的查询结果的对象映射到Girl服务上的对象上返回
 */
public interface CompanyBoyWeatherService {

    /**
     * boy公司提供的天气查询方法
     * @param lon 经度
     * @param lat 维度
     * @return boy公司返回的天气信息
     */
    BoyWeather queryBoyWeather(String lon, String lat);
}
