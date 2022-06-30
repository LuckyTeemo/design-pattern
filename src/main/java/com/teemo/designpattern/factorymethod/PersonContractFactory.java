package com.teemo.designpattern.factorymethod;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/**
 * @author Teemo
 * @date 2022/6/30
 * 个人合同工厂
 */
public class PersonContractFactory implements ContractFactory {

    private static final Map<ContractType, PersonContract> PERSON_CONTRACT_MAP;

    static {
        PERSON_CONTRACT_MAP = new EnumMap<>(ContractType.class);
        Arrays.stream(ContractType.values()).forEach(type -> PERSON_CONTRACT_MAP.put(type, new PersonContract(type)));
    }

    @Override
    public Contract createContract(ContractType contractType) {
        return PERSON_CONTRACT_MAP.get(contractType);
    }

    @Override
    public String toString() {
        return "person factory";
    }
}
