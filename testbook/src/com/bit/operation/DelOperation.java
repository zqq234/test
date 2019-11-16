package com.bit.operation;

import com.bit.book.BookList;

/**
 * @className DelOperation
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/11/16 11:33
 * @Version 1.0
 **/
public class DelOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("DelOperation");
        System.out.println("输入需要删除书籍的名称");
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
        for (int j = i; j <bookList.getSize()-1 ; j++) {
            bookList.setBooks(j,bookList.getBook(j+1));
        }
        System.out.println("删除成功");
        bookList.setSize(bookList.getSize()-1);
    }
}
