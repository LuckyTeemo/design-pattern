package com.teemo.designpattern.prototype;

/**
 *
 * @author Teemo
 * @date 2022/9/7
 */
public interface Prototype {

    /**
     * 拷贝方法
     * @return 拷贝对象
     */
    Object copy(Integer damage);
}
