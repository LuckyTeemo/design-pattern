package com.teemo.designpattern.abstractfactory;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Teemo
 * @date 2022/7/4
 */
@Getter
@Setter
public class ComputerDIY {

    private CPU cpu;

    private GPU gpu;

    public static class FactoryMaker {

        public enum ComputerDIYManufacturer {
            INTEL, AMD;
        }

        public static ComputerDIYFactory makeFactory(ComputerDIYManufacturer manufacturer) {
            switch (manufacturer) {
                case INTEL:
                    return new IntelFactory();
                case AMD:
                    return new AMDFactory();
                default:
                    throw new IllegalArgumentException("manufacturer not supported");
            }
        }
    }
}
