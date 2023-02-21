package com.teemo.designpattern.bridge;

import java.math.BigDecimal;

/**
 *
 * @author Teemo
 * @date 2023/2/21
 * 支付抽象化角色  定义一个公共的支付方法
 */
public abstract class Payment {

    protected VerifyPaymentMode verifyPaymentMode;

    public Payment(VerifyPaymentMode verifyPaymentMode) {
        this.verifyPaymentMode = verifyPaymentMode;
    }

    /**
     * 支付
     * @param idSign 身份标识
     * @param payMoney 支付钱款
     */
    protected abstract void pay(String idSign, BigDecimal payMoney);
}
