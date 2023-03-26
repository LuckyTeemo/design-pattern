package com.teemo.designpattern.memento;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * sql的备忘录
 * 备忘录的访问权限设置的越小越好，一般设置为当前包的访问权限
 * @author Teemo
 * @date 2023/3/26
 */
@Data
class SqlMemento {

    /**
     * 保存执行成功的sql
     */
    private List<String> successSqlList;

    public SqlMemento() {
        this.successSqlList = new ArrayList<>();
    }

    public void addSuccessSql(String successSql) {
        successSqlList.add(successSql);
    }
}
