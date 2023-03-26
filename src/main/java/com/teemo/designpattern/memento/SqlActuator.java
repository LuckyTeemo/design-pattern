package com.teemo.designpattern.memento;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * sql的执行器 发起人角色  实现的效果是备忘录保存的是成功执行的sql 一旦有执行失败的sql 则将备忘录中保存的执行成功的
 * sql替换到当前sql执行器中
 * @author Teemo
 * @date 2023/3/26
 */
@Data
public class SqlActuator {

    /**
     * sql执行情况
     */
    private boolean success;

    /**
     * sql语句
     */
    private List<String> sqlList = new ArrayList<>();


    private Random random = new Random();

    public SqlMemento createMemento() {
        SqlMemento sqlMemento = new SqlMemento();
        sqlMemento.setSuccessSqlList(sqlList);
        return sqlMemento;
    }

    public void resetSqlMemento(SqlMemento sqlMemento) {
        sqlList = sqlMemento.getSuccessSqlList();

    }

    public void executeSql(String sql) {

        if (sql.contains("select")) {
            System.out.println("查询sql不用回滚");
            success = true;
        }else {
            success = random.nextBoolean();
            System.out.println("写sql的执行结果为" + success);
        }
        // 添加到sql执行器的sql列表中
        sqlList = new ArrayList<>(sqlList);
        sqlList.add(sql);
    }
}
