package com.teemo.designpattern.factorymethod;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/**
 * @author Teemo
 * @date 2022/6/30
 * 公司合同创建工厂
 */
public class CompanyContractFactory implements ContractFactory {

    private static final Map<ContractType, CompanyContract> COMPANY_FACTORY_MAP;

    static {
        COMPANY_FACTORY_MAP = new EnumMap<>(ContractType.class);
        Arrays.stream(ContractType.values()).forEach(type -> COMPANY_FACTORY_MAP.put(type, new CompanyContract(type)));
    }

    @Override
    public Contract createContract(ContractType contractType) {
        return COMPANY_FACTORY_MAP.get(contractType);
    }

    @Override
    public String toString() {
        return "company factory";
    }
}
