package com.teemo.designpattern.visitor;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author Teemo
 * @date 2023/3/25
 * 抽象产品类
 */
@Data
@AllArgsConstructor
public abstract class Product {

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品价格
     */
    private BigDecimal price;

    /**
     * 生产日期
     */
    private LocalDate produceDate;

}
