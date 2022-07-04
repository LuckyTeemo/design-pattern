package com.teemo.designpattern.abstractfactory;

/**
 * @author Teemo
 * @date 2022/7/4
 * Intel工厂负责生产Intel的cpu和显卡
 */
public class IntelFactory implements ComputerDIYFactory {

    @Override
    public CPU createCPU() {
        return new IntelCPU();
    }

    @Override
    public GPU createGPU() {
        return new InterGPU();
    }
}
