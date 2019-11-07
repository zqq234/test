import java.util.Scanner;

/**
 * @className Power
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/10/26 11:58
 * @Version 1.0
 **/
public class Power {
    public static void main(String[] args) {
        System.out.println("请输入求10的多少次方");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println(Math.pow(10,number));
    }
}
