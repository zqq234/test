package com.bit.operation;

import com.bit.book.BookList;

/**
 * @className FindOperation
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/11/16 11:34
 * @Version 1.0
 **/
public class FindOperation implements  IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("FindOperation");
        System.out.println("输入需要查找书籍的名称");
        String name=scanner.next();
        int i;
        for (i = 0; i <bookList.getSize() ; i++) {
            if(bookList.getBook(i).name.equals(name)){
                break;
            }
        }
        if(i>=bookList.getSize()){
            System.out.println("没有这本书");
            return;
        }
        System.out.println(bookList.getBook(i));
    }
}
