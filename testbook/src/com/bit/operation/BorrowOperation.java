package com.bit.operation;

import com.bit.book.BookList;

/**
 * @className BorrowOperation
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/11/16 11:33
 * @Version 1.0
 **/
public class BorrowOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("BorrowOperation");
        System.out.println("输入需要借阅书籍的名称");
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
        if(bookList.getBook(i).isBorrowed){
            System.out.println("这本书已被借出");
            return;
        }
        bookList.getBook(i).isBorrowed=true;
        System.out.println("借书成功");
    }
}
