package com.teemo.designpattern.bridge;

/**
 *
 * @author Teemo
 * @date 2023/2/21
 * 支付验证   实现化角色  定义验证方法
 */
public interface VerifyPaymentMode {

    /**
     * 身份验证
     * @param idSign 身份标识
     * @return 验证结果
     */
    boolean verify(String idSign);
}
