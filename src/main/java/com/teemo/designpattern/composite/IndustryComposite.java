package com.teemo.designpattern.composite;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Teemo
 * @date 2023/3/8
 * 行业树枝节点
 * 非叶子节点处理类
 */
@Data
public class IndustryComposite extends IndustryComponent{

    private String industryName;

    /**
     * 持有树枝节点列表
     */
    private List<IndustryComponent> industryComponentList = new ArrayList<>();

    @Override
    public String getIndustryName() {
        return this.industryName;
    }

    @Override
    public IndustryComponent addIndustry(IndustryComponent industryComponent) {

        industryComponentList.add(industryComponent);
        return this;
    }

    @Override
    public void getIndustryList(String industryName) {

        industryComponentList.forEach(industry -> {
            System.out.println(industry.getIndustryName());
            industry.getIndustryList(industry.getIndustryName());
        });

    }
}
