package com.teemo.designpattern.factorymethod;

/**
 * @author Teemo
 * @date 2022/6/30
 * 合同模板接口
 */
public interface Contract {

    /**
     * 获取合同类型
     * @return 合同类型枚举
     */
    ContractType getContractType();
}
