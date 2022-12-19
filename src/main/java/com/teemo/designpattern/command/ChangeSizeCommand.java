package com.teemo.designpattern.command;

/**
 *
 * @author Teemo
 * @date 2022/10/31
 */
public class ChangeSizeCommand extends ChangeCommand{

    private Profession profession;

    public ChangeSizeCommand(Profession profession) {
        this.profession = profession;
    }

    @Override
    public void execute(Target target) {
        profession.changeTargetAttribute(target);
    }
}
