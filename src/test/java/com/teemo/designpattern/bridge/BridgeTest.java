package com.teemo.designpattern.bridge;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class BridgeTest {

    @Test
    public void test() {
        Payment aliPayment = new AliPayment(new VerifyPasswordPayment());
        aliPayment.pay("ali001", new BigDecimal("6.66"));
    }
}
