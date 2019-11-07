import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @className Sort
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/10/25 17:51
 * @Version 1.0
 **/
public class Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入三个数：");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a<b){
            int temp=a;
            a=b;
            b=temp;
        }
        if(a<c){
            int temp=a;
            a=c;
            c=temp;
        }
        if(b<c){
            int temp=b;
            b=c;
            c=temp;
        }
        System.out.println(a+","+b+","+c);
    }
}
