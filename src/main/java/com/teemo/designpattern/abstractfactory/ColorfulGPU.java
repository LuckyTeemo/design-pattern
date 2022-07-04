package com.teemo.designpattern.abstractfactory;

/**
 * @author Teemo
 * @date 2022/7/4
 * 定义具体实现类-七彩虹制造的显卡
 */
public class ColorfulGPU implements GPU{

    private static final String DESCRIPTION = "This is colorful gpu";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
