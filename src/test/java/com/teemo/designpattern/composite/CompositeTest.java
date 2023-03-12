package com.teemo.designpattern.composite;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CompositeTest {

    @Test
    public void test() {

        IndustryComposite grade = new IndustryComposite();
        grade.setIndustryName("成绩");

        IndustryComposite subject = new IndustryComposite();
        subject.setIndustryName("科目");
        grade.addIndustry(subject);

        IndustryComposite chinese = new IndustryComposite();
        IndustryComposite math = new IndustryComposite();
        IndustryComposite english = new IndustryComposite();

        chinese.setIndustryName("语文");
        math.setIndustryName("数学");
        english.setIndustryName("英语");

        subject.addIndustry(chinese);
        subject.addIndustry(math);
        subject.addIndustry(english);
        subject.getIndustryList("科目");
    }
}
