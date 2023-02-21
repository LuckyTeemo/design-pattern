package com.teemo.designpattern.bridge;

import java.math.BigDecimal;

/**
 *
 * @author Teemo
 * @date 2023/2/21
 */
public class AliPayment extends Payment{

    public AliPayment(VerifyPaymentMode verifyPaymentMode) {
        super(verifyPaymentMode);
    }

    @Override
    protected void pay(String idSign, BigDecimal payMoney) {

        System.out.println("支付宝支付成功");
        verifyPaymentMode.verify(idSign);
        System.out.println("支付宝扣款 " + payMoney);
    }
}
