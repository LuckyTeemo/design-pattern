package com.teemo.designpattern.bridge;

/**
 *
 * @author Teemo
 * @date 2023/2/21
 */
public class VerifyPasswordPayment implements VerifyPaymentMode{

    @Override
    public boolean verify(String idSign) {

        System.out.println("密码验证成功");
        return true;
    }
}
