package com.teemo.designpattern.visitor;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author Teemo
 * @date 2023/3/25
 * 水果类
 */
public class Fruit extends Product implements ProductAccept{

    public Fruit(String name, BigDecimal price, LocalDate produceDate) {
        super(name, price, produceDate);
    }

    @Override
    public void accept(Visitor visitor) {

        visitor.visit(this);
    }
}
