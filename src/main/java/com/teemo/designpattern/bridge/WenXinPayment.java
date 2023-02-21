package com.teemo.designpattern.bridge;

import java.math.BigDecimal;

/**
 *
 * @author Teemo
 * @date 2023/2/21
 */
public class WenXinPayment extends Payment{

    public WenXinPayment(VerifyPaymentMode verifyPaymentMode) {
        super(verifyPaymentMode);
    }

    @Override
    protected void pay(String idSign, BigDecimal payMoney) {
        System.out.println("开始进行身份验证");
        verifyPaymentMode.verify(idSign);
        System.out.println("扣款成功 扣款 " + payMoney);
    }
}
