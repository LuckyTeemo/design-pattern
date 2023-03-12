package com.teemo.designpattern.composite;

/**
 *
 * @author Teemo
 * @date 2023/3/8
 * 行业抽象根节点 定义公共行为
 */
public abstract class IndustryComponent {

    /**
     * 获取行业名称
     * @return 行业名称
     */
    public abstract String getIndustryName();

    /**
     * 新增行业
     * @param industryComponent 行业
     * @return 行业
     */
    public abstract IndustryComponent addIndustry(IndustryComponent industryComponent);

    /**
     * 查询指定行业下的所有行业信息
     * @param industryName 行业名称
     * @return 行业名称的所有子节点
     */
    public abstract void getIndustryList(String industryName);
}
