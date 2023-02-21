package com.teemo.designpattern.bridge;

/**
 *
 * @author Teemo
 * @date 2023/2/21
 */
public class VerifyFaceRecognitionPayment implements VerifyPaymentMode{

    @Override
    public boolean verify(String idSign) {

        System.out.println("人脸识别成功");
        return true;
    }
}
