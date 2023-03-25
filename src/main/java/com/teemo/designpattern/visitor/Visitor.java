package com.teemo.designpattern.visitor;

/**
 * 访问者接口
 * @author Teemo
 * @date 2023/3/25
 */
public interface Visitor {

    /**
     * 访问糖果类
     * @param candy 糖果类
     */
    void visit(Candy candy);

    /**
     * 访问水果类
     * @param fruit 水果类
     */
    void visit(Fruit fruit);
}
