package com.teemo.designpattern.factorymethod;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FactoryMethodTest {

    @Test
    void Test() {
        ContractFactory contractFactory = new PersonContractFactory();
        Contract contract = contractFactory.createContract(ContractType.LABOR_CONTRACT);
        System.out.println(contract);

        contract = contractFactory.createContract(ContractType.CAR_CONTRACT);
        System.out.println(contract);

        contractFactory = new CompanyContractFactory();
        contract = contractFactory.createContract(ContractType.HOUSE_CONTRACT);
        System.out.println(contract);
    }
}
