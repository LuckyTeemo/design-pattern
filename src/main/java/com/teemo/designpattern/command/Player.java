package com.teemo.designpattern.command;

import lombok.Data;

/**
 *
 * @author Teemo
 * @date 2022/10/31
 * 玩家作为调用者 用来执行命令
 */
@Data
public class Player {

    private ChangeCommand command;

    private Target target;

    public void setChangeCommand(ChangeCommand command) {
        this.command = command;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    /**
     * 执行命令
     */
    public void action() {
        this.command.execute(target);
    }
}
