import java.util.Scanner;

/**
 * @className CalculateWeek
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/10/25 16:31
 * @Version 1.0
 **/
public class CalculateWeek {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("请输入天数：");
            int day = sc.nextInt();
            int remain = day % 7;
            int week = day / 7;
            System.out.println("周数：" + week + "   剩余天数：" + remain);
        }
    }
}
