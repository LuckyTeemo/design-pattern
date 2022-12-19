package com.teemo.designpattern.command;

/**
 *
 * @author Teemo
 * @date 2022/11/1
 */
public class ChangeVisibilityCommand extends ChangeCommand{

    private Profession profession;

    public ChangeVisibilityCommand(Profession profession) {
        this.profession = profession;
    }

    @Override
    public void execute(Target target) {
        profession.changeTargetAttribute(target);
    }

}
