package com.teemo.designpattern.visitor;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class VisitorTest {

    @Test
    public void test() {

        // 多个商品一起售卖
        List<ProductAccept> productAcceptList = Arrays.asList(
                new Candy("德芙巧克力", new BigDecimal("8.8"), LocalDate.of(2023, 3, 26)),
                new Fruit("苹果", new BigDecimal("1.6"), LocalDate.of(2023, 3, 26))
        );

        // 使用打折访问者进行售卖
        Visitor discountVisitor = new DiscountVisitor();

        // 遍历商品 由商品接收者统一接收访问者的访问
        productAcceptList.forEach(accept -> accept.accept(discountVisitor));
    }
}
