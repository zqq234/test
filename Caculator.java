import java.util.Scanner;

/**
 * @className Caculator
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/10/25 17:36
 * @Version 1.0
 **/
public class Caculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要进行运算的两个数：");
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        while(true){
            System.out.println("请选择功能：");
            int select=sc.nextInt();
            switch(select){
                case 1:
                    System.out.println("两个数之和为："+(number1+number2));
                    break;
                case 2:
                    System.out.println("两个数之差为："+Math.abs(number1-number2));
                    break;
                case 3:
                    System.out.println("两个数之积："+(number1*number2));
                    break;
                case 4:
                    System.out.println("两个数之商："+(number1/number2));
                    break;
                default:
                    System.out.println("两个数的余数："+(number1%number2));
            }
        }
    }
}
