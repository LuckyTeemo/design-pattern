package com.teemo.designpattern.visitor;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author Teemo
 * @date 2023/3/25
 * 糖果类
 */
public class Candy extends Product implements ProductAccept{

    public Candy(String name, BigDecimal price, LocalDate produceDate) {
        super(name, price, produceDate);
    }

    @Override
    public void accept(Visitor visitor) {

        visitor.visit(this);
    }
}
