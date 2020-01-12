package com.bit;

import com.bit.Database.Mysql;
import com.bit.User.*;

import java.util.Scanner;

/**
 * @className Main
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/1/8 12:15
 * @Version 1.0
 **/
public class Main {
    public static User login(){
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("请输入身份:0.管理员  1.用户");
            int chioce=scanner.nextInt();
            System.out.println("请输入id");
            int id=scanner.nextInt();
            System.out.println("请输入名字");
            String name=scanner.next();
            if(chioce==1) {
                if(Mysql.judge(id)==1){
                    User user=new NormalUser(name);
                    return user;
                }
                System.out.println("id错误");
            }else {
                User user = new Admin(name);
                return user;
            }
        }

    }
    public static void main(String[] args) {
        User user=login();
        while(true){
            int chioce=user.menu();
            user.doOperation(chioce);
        }
    }
}
