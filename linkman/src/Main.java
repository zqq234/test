import com.bit.User.User;

import java.util.Scanner;

/**
 * @className Main
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/1/6 17:06
 * @Version 1.0
 **/
public class Main {
    private static User login(){
        Scanner scanner=new Scanner(System.in);
        int password=12345;
        System.out.println("-----------------登陆界面-----------------");
        System.out.println("请输入用户名：");
        String name=scanner.next();
        System.out.println("请输入密码：");
        while(true){
            int a=scanner.nextInt();
            if(password==a){
                User u=new User(name);
                return u;
            }else {
                System.out.println("密码错误,请重新输入：");
            }
        }

    }
    public static void main(String[] args){
        User user=login();
        while(true){
            int chioce=user.menu();
            user.doOperation(chioce);
        }
    }
}
