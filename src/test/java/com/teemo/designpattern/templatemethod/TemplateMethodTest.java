package com.teemo.designpattern.templatemethod;

import com.teemo.designpattern.templateMethod.Mage;
import com.teemo.designpattern.templateMethod.Player;
import com.teemo.designpattern.templateMethod.Warrior;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author Teemo
 * @date 2022/8/21
 */
@SpringBootTest
public class TemplateMethodTest {

    @Test
    public void test() {
        // 先操纵法师打boss
        Player player = new Player(new Mage());
        player.attackBoss();
        // 再换个职业打boss
        player.changeProfession(new Warrior());
        player.attackBoss();
    }
}
