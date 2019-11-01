import java.util.Random;
import java.util.Scanner;
/**
 * @className GuessNumber
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/10/26 21:15
 * @Version 1.0
 **/
public class GuessNumber {
    public static void main(String[] args){
        Random random=new Random();
        int randNum=random.nextInt(100)+1;
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("请输入猜的数字：1-100");
            int num=sc.nextInt();
            if(num>randNum){
                System.out.println("猜大了！");
            }else if(num==randNum){
                System.out.println("猜对了！");
                break;
            }else{
                System.out.println("猜小了！");
            }
        }
        sc.close();
    }
}
