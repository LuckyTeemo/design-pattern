package com.teemo.designpattern;

import com.teemo.designpattern.singleton.enums.EnumSingleton;
import com.teemo.designpattern.singleton.hungry.HungrySingletonStaticBlock;
import com.teemo.designpattern.singleton.hungry.HungrySingletonStaticConst;
import com.teemo.designpattern.singleton.inner.StaticInnerSingleton;
import com.teemo.designpattern.singleton.lazy.LazySingletonDcl;
import com.teemo.designpattern.singleton.lazy.LazySingletonSyn;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DesignPatternApplicationTests {

    @Test
    void hungryTest() {

        HungrySingletonStaticConst cInstance = HungrySingletonStaticConst.getInstance();
        HungrySingletonStaticConst cInstance1 = HungrySingletonStaticConst.getInstance();
        System.out.println(cInstance == cInstance1);

        HungrySingletonStaticBlock bInstance = HungrySingletonStaticBlock.getInstance();
        HungrySingletonStaticBlock bInstance1 = HungrySingletonStaticBlock.getInstance();
        System.out.println(bInstance == bInstance1);
    }

    @Test
    void lazyTest() {

        LazySingletonSyn sInstance = LazySingletonSyn.getInstance();
        LazySingletonSyn sInstance1 = LazySingletonSyn.getInstance();
        System.out.println(sInstance == sInstance1);

        LazySingletonDcl dInstance = LazySingletonDcl.getInstance();
        LazySingletonDcl dInstance1 = LazySingletonDcl.getInstance();
        System.out.println(dInstance == dInstance1);
    }

    @Test
    void staticInnerTest() {

        StaticInnerSingleton instance = StaticInnerSingleton.getInstance();
        StaticInnerSingleton instance1 = StaticInnerSingleton.getInstance();
        System.out.println(instance == instance1);
    }

    @Test
    void enumTest() {

        EnumSingleton instance = EnumSingleton.getInstance();
        EnumSingleton instance1 = EnumSingleton.getInstance();
        System.out.println(instance == instance1);
    }

}
