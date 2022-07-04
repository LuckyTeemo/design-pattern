package com.teemo.designpattern.abstractfactory;

/**
 * @author Teemo
 * @date 2022/7/4
 * 定义具体产品类-Intel制造的CPU
 */
public class IntelCPU implements CPU{

    private static final String DESCRIPTION = "This is intel CPU";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
