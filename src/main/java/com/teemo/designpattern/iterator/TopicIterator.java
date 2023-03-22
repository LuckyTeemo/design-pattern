package com.teemo.designpattern.iterator;

/**
 * 主题类的迭代器类
 * @author Teemo
 * @date 2023/3/22
 */
public class TopicIterator implements ListIterator<Topic> {

    /**
     * 持有主题类的数组
     */
    private Topic[] topicArray;

    /**
     * 记录存储位置的游标
     */
    private int position;

    public TopicIterator(Topic[] topicArray) {
        this.topicArray = topicArray;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {

        return position < topicArray.length;
    }

    @Override
    public void reset() {
        position = 0;
    }

    @Override
    public Topic next() {
        return topicArray[position++];
    }

    @Override
    public Topic currentItem() {
        return topicArray[position];
    }
}
