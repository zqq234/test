import java.util.Scanner;

/**
 * @className Fibo
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/10/26 14:51
 * @Version 1.0
 **/
public class Fibo {
    public static int func(int n){
        int f1=1;
        int f2=1;
        int f3=f1;
        for(int i=3;i<=n;i++){
            f3=f1+f2;
            f1=f2;
            f2=f3;
        }
        return f3;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(func(n));
    }
}
