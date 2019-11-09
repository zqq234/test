import java.util.Scanner;

/**
 * @className Week
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/10/25 20:20
 * @Version 1.0
 **/
public class Week {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入年月日");
        int number=sc.nextInt();
        int year=number/10000;
        int month=number/100%100;
        int day=number%100;
        if(month==1||month==2){
            month+=12;
        }
        int c=year/100;
        year=year-c*100;
        int week=(c/4)-2*c+(year+year/4)+(13*(month+1)/5+day-1);
        week%=7;
        if(week==0){
            System.out.println("星期天");
        }else{
            System.out.println("星期"+week);
        }
    }
}
