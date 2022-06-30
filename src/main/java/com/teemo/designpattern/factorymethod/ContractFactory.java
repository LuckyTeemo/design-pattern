package com.teemo.designpattern.factorymethod;

/**
 * @author Teemo
 * @date 2022/6/30
 * 定义创建合同模板对象的接口
 */
public interface ContractFactory {

    /**
     * 生成合同模板
     * @param contractType 合同类型
     * @return 合同对象
     */
    Contract createContract(ContractType contractType);
}
