package com.teemo.designpattern.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author Teemo
 * @date 2023/3/12
 * 创建围棋享元类的工厂类 通过维护一个享元池实现通过外部状态获取享元池中的单例
 */
public class GoFlyweightFactory {

    public static final String WHITE_COLOR = "白色";

    public static final String BLACK_COLOR = "黑色";

    /**
     * 享元池
     */
    private Map<String, GoFlyWeight> goFlyWeightMap = new ConcurrentHashMap<>();

    /**
     * 私有化构造方法 实现享元池的初始化
     */
    private GoFlyweightFactory() {

        goFlyWeightMap.put(WHITE_COLOR, new WhiteGoFlyWeight(WHITE_COLOR));
        goFlyWeightMap.put(BLACK_COLOR, new BlackGoFlyWeight(BLACK_COLOR));
    }

    /**
     * 暴露公共方法返回单例工厂类
     * @return 创建围棋棋子工厂类
     */
    public static GoFlyweightFactory getInstance() {
        return SingleHolder.INSTANCE;
    }

    /**
     * 生产棋子
     * @param goColor 棋子颜色
     * @return 棋子类
     */
    public GoFlyWeight createGoFlyWeight(String goColor, String position) {

        if (goFlyWeightMap.containsKey(goColor)) {
            GoFlyWeight goFlyWeight = goFlyWeightMap.get(goColor);
            // 这里设置内部状态的值
            goFlyWeight.fillPosition(position);
            return goFlyWeight;
        }
        throw new RuntimeException("符合条件的棋子不存在");
    }

    private static class SingleHolder{
        private static final GoFlyweightFactory INSTANCE = new GoFlyweightFactory();
    }
}
