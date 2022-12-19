package com.teemo.designpattern.command;

/**
 *
 * @author Teemo
 * @date 2022/10/31
 */
public abstract class ChangeCommand {

    /**
     * 对目标执行命令
     * @param target 目标
     */
    public abstract void execute(Target target);
}
