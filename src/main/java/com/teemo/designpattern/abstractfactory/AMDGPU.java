package com.teemo.designpattern.abstractfactory;

/**
 * @author Teemo
 * @date 2022/7/4
 * 定义显卡具体实现类-amd制造的显卡
 */
public class AMDGPU implements GPU{

    private static final String DESCRIPTION = "This is amd gpu";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
