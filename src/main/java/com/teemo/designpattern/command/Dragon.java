package com.teemo.designpattern.command;

/**
 *
 * @author Teemo
 * @date 2022/10/31
 */
public class Dragon extends Target{

    public Dragon() {
        setSize(SizeEnum.HUGE);
        setVisibility(VisibilityEnum.VISIBLE);
    }
}
