package com.bit.user;

import com.bit.book.BookList;
import com.bit.operation.IOperation;

/**
 * @className User
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/11/16 11:35
 * @Version 1.0
 **/
public abstract class User {
    protected String name;
    protected IOperation[] operations;

    public abstract int menu();
    public void doOperation(int choice, BookList bookList) {
        operations[choice].work(bookList);
    }
}
