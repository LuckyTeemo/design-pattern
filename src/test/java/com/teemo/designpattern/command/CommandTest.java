package com.teemo.designpattern.command;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author Teemo
 * @date 2022/11/1
 */
@SpringBootTest
public class CommandTest {

    @Test
    public void test() {

        // 玩家作为调用者
        Player novice = new Player();
        // 让法师作为接收者执行具体命令
        Profession mage = new Mage();
        // 缩小命令并指定接收者
        ChangeCommand changeSizeCommand = new ChangeSizeCommand(mage);
        // 执行缩小目标为龙
        novice.setTarget(new Dragon());
        // 调用者接受命令 改变龙的大小
        novice.setChangeCommand(changeSizeCommand);
        // 调用者执行命令
        novice.action();

        // 让盗贼作为接收者执行具体命令
        Profession thieves = new Thieves();
        // 隐身命令并指定接收者
        ChangeCommand changeVisibilityCommand = new ChangeVisibilityCommand(thieves);
        // 调用者接受命令 改变龙的隐身状态
        novice.setCommand(changeVisibilityCommand);
        // 调用者执行命令
        novice.action();

    }
}
