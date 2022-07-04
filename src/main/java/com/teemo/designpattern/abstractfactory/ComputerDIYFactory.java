package com.teemo.designpattern.abstractfactory;

/**
 * @author Teemo
 * @date 2022/7/4
 * 工厂接口-负责生产CPU、GPU
 */
public interface ComputerDIYFactory {

    /**
     * 生产CPU
     * @return CPU产品 不指定具体类
     */
    CPU createCPU();

    /**
     * 生产GPU
     * @return GPU产品 不指定具体类
     */
    GPU createGPU();
}
