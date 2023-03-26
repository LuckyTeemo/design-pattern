package com.teemo.designpattern.memento;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MementoTest {

    @Test
    public void test() {

        // 创建sql的执行器
        SqlActuator sqlActuator = new SqlActuator();
        // 创建sql备忘录
        SqlMemento memento = sqlActuator.createMemento();
        // 执行sql
        for (int i = 0; i < 5; i++) {
            sqlActuator.executeSql("update from table where name = " + i);
            if (sqlActuator.isSuccess()) {
                System.out.println("执行成功 创建sql成功快照");
                memento = sqlActuator.createMemento();
                System.out.println("快照为 " + sqlActuator.getSqlList());
            }else {
                System.out.println("执行失败 当前sql执行列表为 " + sqlActuator.getSqlList());
                sqlActuator.resetSqlMemento(memento);
                System.out.println("恢复到失败之前的sql列表为 " + sqlActuator.getSqlList());
            }
        }

    }
}
