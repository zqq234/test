package com.bit.User;

import com.bit.doOperation.*;

import java.util.Scanner;

/**
 * @className NormalUser
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/1/9 12:00
 * @Version 1.0
 **/
public class NormalUser extends User {
    public NormalUser(String name) {
        this.name=name;
        this.operations = new IOperation[] {
                new Exit(),
                new FindBook(),
                new BrrowBook(),
                new ReturnBook(),
                new DisplayBook()
        };
    }
    public int menu() {
        System.out.println("=============================");
        System.out.println("Hello " + this.name + ", 欢迎使用图书管理系统!");
        System.out.println("1. 查找图书");
        System.out.println("2. 借阅图书");
        System.out.println("3. 归还图书");
        System.out.println("4. 显示所有图书");
        System.out.println("0. 退出系统");
        System.out.println("=============================");
        System.out.println("请输入您的选择: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
