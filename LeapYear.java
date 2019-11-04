import java.util.Scanner;

/**
 * @className LeapYear
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/10/25 18:52
 * @Version 1.0
 **/
public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("请输入年份：");
            year=sc.nextInt();
            if((year%400==0)||(year%4==0&&year%100!=0)){
                System.out.println(year+"是闰年");
            }else{
                System.out.println(year+"不是闰年");
            }
        }
    }
}
