package com.bit.User;

import com.bit.doOperation.IOperation;

/**
 * @className User
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/1/8 14:39
 * @Version 1.0
 **/

public abstract class User {
    protected String name;
    protected IOperation[] operations;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int menu();

    public void doOperation(int choice) {
        operations[choice].work();
    }
}

