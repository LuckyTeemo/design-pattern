package com.teemo.designpattern.observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Teemo
 * @date 2023/3/19
 * 事件处理类  负责  也就是观察目标类
 */
public class EventManager {

    /**
     * 事件枚举类：短信事件 app事件
     */
    public enum EventEnum{
        MESSAGE,APP;
    }

    Map<Enum<EventEnum>, List<EventListener>> eventEnumListenerListMap = new HashMap<>();

    /**
     * 通过构造方法初始化事件集合
     * @param eventEnumList  订阅key
     */
    public EventManager(Enum<EventEnum>... eventEnumList) {

        Arrays.stream(eventEnumList).forEach(event -> {
            eventEnumListenerListMap.put(event, new ArrayList<>());
        });
    }

    /**
     * 添加指定的观察者
     * @param eventEnum 订阅key
     * @param eventListener 订阅的具体事件
     */
    public void subscribe(Enum<EventEnum> eventEnum, EventListener eventListener) {

        List<EventListener> eventListenerList = eventEnumListenerListMap.get(eventEnum);
        eventListenerList.add(eventListener);
    }

    /**
     * 取消订阅
     * @param eventEnum 订阅key
     * @param eventListener 订阅的具体事件
     */
    public void unSubscribe(Enum<EventEnum> eventEnum, EventListener eventListener) {

        List<EventListener> eventListenerList = eventEnumListenerListMap.get(eventEnum);
        eventListenerList.remove(eventListener);
    }

    /**
     * 通知方法 通知各个观察者进行相应操作
     * @param enumEnum 事件key
     * @param cost 操作依赖的数据
     */
    public void notify(Enum<EventEnum> enumEnum, Cost cost) {

        List<EventListener> eventListenerList = eventEnumListenerListMap.get(enumEnum);
        eventListenerList.forEach(eventListener -> eventListener.doEvent(cost));
    }
}
