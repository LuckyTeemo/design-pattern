package com.teemo.designpattern.iterator;

/**
 *
 * @author Teemo
 * @date 2023/3/22
 * 迭代器接口
 */
public interface ListIterator<E> {

    /**
     * 是否有下一个元素
     * @return 是或否
     */
    boolean hasNext();

    /**
     * 重置容器元素指针
     */
    void reset();

    /**
     * 返回下一个元素
     * @return 下一个元素
     */
    E next();

    /**
     * 返回当前元素
     * @return 当前元素
     */
    E currentItem();
}
