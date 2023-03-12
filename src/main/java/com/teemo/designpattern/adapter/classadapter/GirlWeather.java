package com.teemo.designpattern.adapter.classadapter;

import lombok.Data;

/**
 *
 * @author Teemo
 * @date 2023/3/1
 * 目标需要的天气信息
 */
@Data
public class GirlWeather {

    private String temperature;

    private String weatherType;

    private String longitude;

    private String latitude;
}
