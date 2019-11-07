import java.util.Scanner;

/**
 * @className Reverse
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/10/26 10:56
 * @Version 1.0
 **/
public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要反转的数");
        int number=sc.nextInt();
        System.out.println("翻转后的数为");
        while(number>0){
            System.out.print(number%10);
            number/=10;
        }
    }
}
