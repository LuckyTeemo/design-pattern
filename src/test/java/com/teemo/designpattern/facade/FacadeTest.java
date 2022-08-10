package com.teemo.designpattern.facade;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FacadeTest {

    @Test
    void test() {
        StrongerWayFacade strongerWayFacade = new StrongerWayFacade();
        strongerWayFacade.beStrong();
    }
}
