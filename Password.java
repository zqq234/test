import java.util.Scanner;
/**
 * @className Password
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/10/26 21:19
 * @Version 1.0
 **/
public class Password {
    public static void main(String[] args){
        int count=3;
        String key="123";
        while(count>0){
            System.out.print("请输入密码：");
            Scanner sc=new Scanner(System.in);
            String key2=sc.next();
            if(key.equals(key2)){
                System.out.println("密码正确！");
                break;
            }else{
                System.out.println("密码错误，请重新输入！");
            }
            count--;
        }
    }
}
