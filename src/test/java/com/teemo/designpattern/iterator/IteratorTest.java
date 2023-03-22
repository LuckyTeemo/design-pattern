package com.teemo.designpattern.iterator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class IteratorTest {

    @Test
    public void test() {

        // 新建topic的集合实现类
        CustomizeList<Topic> topicList = new TopicList(new Topic[]{new Topic("1"), new Topic("2")});
        // 拿到迭代器
        ListIterator<Topic> iterator = topicList.iterator();
        // 遍历数据
        while (iterator.hasNext()) {
            Topic next = iterator.next();
            System.out.println(next.getName());
        }
    }
}
