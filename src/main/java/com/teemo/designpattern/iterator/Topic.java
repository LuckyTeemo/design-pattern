package com.teemo.designpattern.iterator;

/**
 * 主题类
 * @author Teemo
 * @date 2023/3/22
 */
public class Topic {

    private String name;

    public Topic(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
