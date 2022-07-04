package com.teemo.designpattern.abstractfactory;

/**
 * @author Teemo
 * @date 2022/7/4
 * 定义显卡的具体实现类-Intel制造的显卡
 */
public class InterGPU implements GPU {

    private static final String DESCRIPTION = "This is inter gpu";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
