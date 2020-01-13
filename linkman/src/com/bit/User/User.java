package com.bit.User;
import com.bit.operation.*;

import java.util.Scanner;

/**
 * @className User
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/1/6 17:07
 * @Version 1.0
 **/
public class User {
    protected String name;
    protected IO[] operation=new IO[]{
            new Exit(),
            new AddLinkMan(),
            new Display(),
            new FindLinkMan(),
            new Sort(),
            new UpdateLinkMan()
    };
    public User(String name){
        this.name=name;
    }
    public int menu(){
        System.out.println("------------------------------------------------------------------");
        System.out.println("Hello "+this.name+",欢迎使用通讯录系统");
        System.out.println("0.退出");
        System.out.println("1.添加联系人");
        System.out.println("2.显示所有联系人");
        System.out.println("3.查找联系人");
        System.out.println("4.排序");
        System.out.println("5.修改联系人");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("请输入您的选择：");
        Scanner scanner=new Scanner(System.in);
        int choice=scanner.nextInt();
        return choice;
    }
   public void doOperation(int choice){
        operation[choice].work();
   }
}
