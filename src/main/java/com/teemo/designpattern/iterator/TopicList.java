package com.teemo.designpattern.iterator;

/**
 * 具体集合类
 * @author Teemo
 * @date 2023/3/22
 */
public class TopicList implements CustomizeList<Topic> {

    private Topic[] topicArray;

    public TopicList(Topic[] topicArray) {
        this.topicArray = topicArray;
    }

    @Override
    public ListIterator<Topic> iterator() {

        return new TopicIterator(topicArray);
    }
}
