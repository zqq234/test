import java.util.Scanner;

/**
 * @className IsEven
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/10/25 17:31
 * @Version 1.0
 **/
public class IsEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("请输入数字：");
            int number=sc.nextInt();
            if(number%2==0){
                System.out.println("是偶数");
            }else {
                System.out.println("不是偶数");
            }
        }
    }
}
