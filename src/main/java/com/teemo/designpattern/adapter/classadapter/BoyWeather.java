package com.teemo.designpattern.adapter.classadapter;

import lombok.Data;

/**
 *
 * @author Teemo
 * @date 2023/3/1
 * 需要将该类的信息适配给Girl公司 返回给客户端
 */
@Data
public class BoyWeather {

    private String tem;

    private String wt;

    private String lon;

    private String lat;
}
