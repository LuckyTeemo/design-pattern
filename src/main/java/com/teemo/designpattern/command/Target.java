package com.teemo.designpattern.command;

import lombok.Data;

/**
 *
 * @author Teemo
 * @date 2022/10/31
 * 要改变属性的目标
 */
@Data
public abstract class Target {

    private SizeEnum size;

    private VisibilityEnum visibility;
}
