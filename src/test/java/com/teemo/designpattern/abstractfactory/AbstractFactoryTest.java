package com.teemo.designpattern.abstractfactory;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AbstractFactoryTest {

    private final ComputerDIY computerDIY = new ComputerDIY();

    @Test
    public void Test() {

        final ComputerDIYFactory factory = ComputerDIY.FactoryMaker.makeFactory(ComputerDIY.FactoryMaker.ComputerDIYManufacturer.INTEL);
        computerDIY.setCpu(factory.createCPU());
        computerDIY.setGpu(factory.createGPU());
        System.out.println(computerDIY.getCpu().getDescription());
        System.out.println(computerDIY.getGpu().getDescription());
    }
}
