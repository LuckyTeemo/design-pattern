package com.teemo.designpattern.factorymethod;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author Teemo
 * @date 2022/6/30
 * 公司合同
 */
@RequiredArgsConstructor
@Getter
public class CompanyContract implements Contract{

    private final ContractType contractType;

    @Override
    public String toString() {
        return "company " + contractType;
    }
}
