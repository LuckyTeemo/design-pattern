package com.teemo.designpattern.visitor;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author Teemo
 * @date 2023/3/25
 * 具体打折类 实现商品打折售卖
 */
public class DiscountVisitor implements Visitor{

    @Override
    public void visit(Candy candy) {

        System.out.println("开始售卖糖果");
        if (candy.getProduceDate().compareTo(LocalDate.of(2023, 3, 25)) < 0) {
            System.out.println("糖果过期，停止售卖");
        } else {
            System.out.println("糖果打九折价格为" + candy.getPrice().multiply(new BigDecimal("0.9")));
        }

    }

    @Override
    public void visit(Fruit fruit) {

        System.out.println("开始售卖水果");
        if (fruit.getProduceDate().compareTo(LocalDate.of(2023, 6, 26)) < 0) {
            System.out.println("水果过期，停止售卖");
        } else {
            System.out.println("水果打八折的价格为" + fruit.getPrice().multiply(new BigDecimal("0.8")));
        }
    }
}
