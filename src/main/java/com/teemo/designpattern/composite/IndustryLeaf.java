package com.teemo.designpattern.composite;

import lombok.Data;

/**
 *
 * @author Teemo
 * @date 2023/3/8
 * 行业叶子节点
 */
@Data
public class IndustryLeaf extends IndustryComponent{

    private String industryName;

    @Override
    public String getIndustryName() {
        return this.industryName;
    }

    @Override
    public IndustryComponent addIndustry(IndustryComponent industryComponent) {

        /**
         * 叶子节点不实现此方法 像这种通过IndustryComponent定义所有的行为让子类都实现的方式称为透明组合模式 优点就是可以统一的使用
         * 多个子类 弊端就是像这种方法必须得进行重写
         * 还有一种方式是有些方法是叶子节点和树枝节点自己实现的方法 好处就是没有强约束限制 缺点是子类单独维护 不利于统一多个子类
         */
        return null;
    }

    @Override
    public void getIndustryList(String industryName) {
        System.out.println(industryName);;
    }
}
