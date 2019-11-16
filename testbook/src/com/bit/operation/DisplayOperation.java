package com.bit.operation;

import com.bit.book.BookList;

/**
 * @className DisplayOperation
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/11/16 11:34
 * @Version 1.0
 **/
public class DisplayOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        for (int i = 0; i <bookList.getSize() ; i++) {
            System.out.println(bookList.getBook(i));
        }
    }
}
