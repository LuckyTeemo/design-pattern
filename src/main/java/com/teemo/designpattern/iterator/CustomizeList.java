package com.teemo.designpattern.iterator;

/**
 * 自定义集合
 * @author Teemo
 * @date 2023/3/22
 */
public interface CustomizeList<E> {

    /**
     * 创建迭代器类
     * @return 迭代器
     */
    ListIterator<E> iterator();
}
