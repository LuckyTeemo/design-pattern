package com.teemo.designpattern.abstractfactory;

/**
 * @author Teemo
 * @date 2022/7/4
 * AMD工厂 负责生产amd的cpu和显卡
 */
public class AMDFactory implements ComputerDIYFactory {

    @Override
    public CPU createCPU() {
        return new AMDCPU();
    }

    @Override
    public GPU createGPU() {
        return new AMDGPU();
    }
}
