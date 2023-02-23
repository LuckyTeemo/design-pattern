package com.teemo.designpattern.decorator;

/**
 *
 * @author Teemo
 * @date 2023/2/23
 */
public class WeatherServiceImpl implements WeatherService{

    public static final String CITY_CODE = "1";

    public static final String CITY_AREA_CODE = "2";

    @Override
    public String queryWeather(String code) {

        // 假设1为城市code 2是这个城市下的某个县的code
        if (CITY_CODE.equals(code)) {
            return "返回城市天气";
        }
        if (CITY_AREA_CODE.equals(code)) {
            return "返回县城天气";
        }
        return "位置错误";
    }
}
