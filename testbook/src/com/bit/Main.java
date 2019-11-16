package com.bit;

import com.bit.book.BookList;
import com.bit.user.Admin;
import com.bit.user.NormalUser;
import com.bit.user.User;

import java.util.Scanner;

import static com.bit.operation.IOperation.scanner;

/**
 * @className Main
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/11/16 11:36
 * @Version 1.0
 **/
public class Main {
    public static User login(){
        System.out.println("请输入名字");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();
        System.out.println("请输入身份:0.管理员  1.普通用户");
        int chioce=scanner.nextInt();
        if(chioce==0) {
            User user = new Admin(name);
            return user;
        }else{
           User user=new NormalUser(name);
           return user;
        }
    }
    public static void main(String[] args) {
        BookList bookList=new BookList();
        User user=login();
        while(true){
            int chioce=user.menu();
            user.doOperation(chioce,bookList);
        }


    }
}
