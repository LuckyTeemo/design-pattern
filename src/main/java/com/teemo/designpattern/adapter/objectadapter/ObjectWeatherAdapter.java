package com.teemo.designpattern.adapter.objectadapter;

import com.teemo.designpattern.adapter.classadapter.BoyWeather;
import com.teemo.designpattern.adapter.classadapter.CompanyBoyWeatherService;
import com.teemo.designpattern.adapter.classadapter.CompanyGirlWeatherService;
import com.teemo.designpattern.adapter.classadapter.GirlWeather;

/**
 *
 * @author Teemo
 * @date 2023/3/2
 * 对象适配器 持有Boy服务的引用 组合的方式优点就是方便扩展 后期若需要提供Boy服务其他版本的天气查询信息 只需要在用户端
 * 查询的时候引入Boy服务其他的实现类即可
 */
public class ObjectWeatherAdapter implements CompanyGirlWeatherService {

    private CompanyBoyWeatherService companyBoyWeatherService;

    public ObjectWeatherAdapter(CompanyBoyWeatherService companyBoyWeatherService) {
        this.companyBoyWeatherService = companyBoyWeatherService;
    }

    @Override
    public GirlWeather queryGirlWeather(String longitude, String latitude) {

        BoyWeather boyWeather = companyBoyWeatherService.queryBoyWeather(longitude, latitude);
        GirlWeather girlWeather = new GirlWeather();
        girlWeather.setWeatherType(boyWeather.getWt());
        girlWeather.setTemperature(boyWeather.getTem());
        girlWeather.setLongitude(boyWeather.getLon());
        girlWeather.setLatitude(boyWeather.getLat());
        return girlWeather;
    }
}
