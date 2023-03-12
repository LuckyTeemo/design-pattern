package com.teemo.designpattern.adapter;

import com.teemo.designpattern.adapter.classadapter.CompanyBoyWeatherServiceImpl;
import com.teemo.designpattern.adapter.classadapter.CompanyGirlWeatherServiceImpl;
import com.teemo.designpattern.adapter.classadapter.GirlWeather;
import com.teemo.designpattern.adapter.classadapter.User;
import com.teemo.designpattern.adapter.classadapter.WeatherAdapter;
import com.teemo.designpattern.adapter.objectadapter.ObjectWeatherAdapter;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AdapterTest {

    @Test
    public void test() {

        // 提供Girl服务的天气信息返回给用户
        User user = new User();
        GirlWeather girlWeather = user.queryWeather(new CompanyGirlWeatherServiceImpl(), "100.111", "38.666");
        System.out.println(girlWeather);

        // 用户查询Boy服务提供的天气信息  通过适配器将Boy服务的返回对象映射到Girl服务的返回对象并返回
        GirlWeather boyWeather = user.queryWeather(new WeatherAdapter(), "66.66", "88.88");
        System.out.println(boyWeather);

        // 对象适配器 提供Boy服务的天气信息返回给用户
        GirlWeather girlWeather1 = user.queryWeather(new ObjectWeatherAdapter(new CompanyBoyWeatherServiceImpl()), "66.6", "88.8");
        System.out.println(girlWeather1);

    }
}
