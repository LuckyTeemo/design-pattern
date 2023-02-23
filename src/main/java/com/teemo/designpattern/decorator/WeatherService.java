package com.teemo.designpattern.decorator;

/**
 *
 * @author Teemo
 * @date 2023/2/23
 * 抽象的构件角色 天气服务提供一个方法通过国家规定的标准城市或者区县code查询天气信息
 */
public interface WeatherService {

    /**
     * 通过城市/区县code查询天气信息
     * @param code 城市/区县code
     * @return 天气信息
     */
    String queryWeather(String code);
}
