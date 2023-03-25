package com.teemo.designpattern.visitor;

/**
 * 接收者接口 负责接收访问者的访问 并让各个商品类去实现接收方法
 * @author Teemo
 * @date 2023/3/25
 */
public interface ProductAccept {

    /**
     * 接收访问者的访问
     * @param visitor 访问者
     */
    void accept(Visitor visitor);
}
