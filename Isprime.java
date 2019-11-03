import java.util.Scanner;

/**
 * @className Isprime
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/10/26 14:59
 * @Version 1.0
 **/
public class Isprime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int flag=0;
        for (int i = 2; i <=Math.sqrt(number); i++) {
            if(number%i==0){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("不是素数");
        }else{
            System.out.println("是素数");
        }
    }
}
