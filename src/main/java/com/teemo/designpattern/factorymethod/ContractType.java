package com.teemo.designpattern.factorymethod;

import lombok.RequiredArgsConstructor;

/**
 * @author Teemo
 * @date 2022/6/30
 * 合同类型枚举
 */
@RequiredArgsConstructor
public enum ContractType {

    /**
     * 房屋合同
     */
    HOUSE_CONTRACT("houseContract"),

    /**
     * 汽车合同
     */
    CAR_CONTRACT("carContract"),

    /**
     * 劳动合同
     */
    LABOR_CONTRACT("laborContract");

    private final String title;

    @Override
    public String toString() {
        return title;
    }
}
