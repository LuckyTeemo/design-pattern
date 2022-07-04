package com.teemo.designpattern.abstractfactory;

/**
 * @author Teemo
 * @date 2022/7/4
 * 定义具体产品类-AMD制造的CPU
 */
public class AMDCPU implements CPU {

    static final String DESCRIPTION = "This is amd cpu";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
