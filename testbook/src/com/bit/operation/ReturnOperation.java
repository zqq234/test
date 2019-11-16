package com.bit.operation;

import com.bit.book.BookList;

/**
 * @className ReturnOperation
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/11/16 11:35
 * @Version 1.0
 **/
public class ReturnOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("ReturnOperation");
        System.out.println("输入需要还的书籍名称");
        String name=scanner.next();
        int i;
        for (i = 0; i <bookList.getSize() ; i++) {
            if(bookList.getBook(i).name.equals(name)){
                break;
            }
        }
        if(bookList.getBook(i).isBorrowed){
            bookList.getBook(i).isBorrowed=false;
            System.out.println("还书成功");
        }else{
            System.out.println("还书失败");
        }
    }
}
