package com.teemo.designpattern.bridge;

/**
 *
 * @author Teemo
 * @date 2023/2/21
 */
public class VerifyFingerprintPayment implements VerifyPaymentMode{

    @Override
    public boolean verify(String idSign) {

        System.out.println("指纹验证成功");
        return true;

    }
}
