import java.util.Scanner;

/**
 * @className YearMonthDay
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/10/25 19:02
 * @Version 1.0
 **/
public class YearMonthDay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入将要转化为年月日的八位整数");
        int number=sc.nextInt();
        int year=number/10000;
        int month=number/100%100;
        int day=number%100;
        if(month==1){
            if(day==1){
                System.out.println("上一天日期为"+(year-1)+"年12月31日");
                System.out.println("下一天日期为"+year+"年"+"1月2日");
            }else if(day==31){
                System.out.println("上一天日期为"+year+"1月30日");
                System.out.println("下一天日期为"+year+"年"+(month+1)+"月"+"1日");
            }else{
                System.out.println("上一天日期为"+year+"年"+month+"月"+(day-1)+"日");
                System.out.println("下一天日期为"+year+"年"+month+"月"+(day+1)+"日");
            }
        }else if(month==2){
            if(year%400==0||(year%4==0&&year%100!=0)){
                if(day==1){
                    System.out.println("上一天日期为"+(year-1)+"年1月31日");
                    System.out.println("下一天日期为"+year+"年"+"2月2日");
                }else if(day==28){
                    System.out.println("上一天日期为"+year+"年2月27日");
                    System.out.println("下一天日期为"+year+"年"+(month+1)+"月"+"1日");
                }else{
                    System.out.println("上一天日期为"+year+"年"+month+"月"+(day-1)+"日");
                    System.out.println("下一天日期为"+year+"年"+month+"月"+(day+1)+"日");
                }
            }else{
                if(day==1){
                    System.out.println("上一天日期为"+(year-1)+"年1月31日");
                    System.out.println("下一天日期为"+year+"年"+"2月2日");
                }else if(day==30){
                    System.out.println("上一天日期为"+year+"2月29日");
                    System.out.println("下一天日期为"+year+"年"+(month+1)+"月"+"1日");
                }else{
                    System.out.println("上一天日期为"+year+"年"+month+"月"+(day-1)+"日");
                    System.out.println("下一天日期为"+year+"年"+month+"月"+(day+1)+"日");
                }
            }
        }else if(month==3) {
            if (day == 1) {
                if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                    System.out.println("上一天日期为" + (year - 1) + "年2月28日");
                    System.out.println("下一天日期为" + year + "年" + "3月2日");
                } else {
                    System.out.println("上一天日期为" + (year - 1) + "年2月30日");
                    System.out.println("下一天日期为" + year + "年" + "3月2日");
                }
            } else if (day == 31) {
                System.out.println("上一天日期为" + year + "3月30日");
                System.out.println("下一天日期为" + year + "年" + (month + 1) + "月" + "1日");
            } else {
                System.out.println("上一天日期为" + year + "年" + month + "月" + (day - 1) + "日");
                System.out.println("下一天日期为" + year + "年" + month + "月" + (day + 1) + "日");
            }
        }else if(month==4||month==6||month==8||month==10){
            if(day==1){
                System.out.println("上一天日期为"+year+"年"+(month-1)+"月31日");
                System.out.println("下一天日期为"+year+"年"+month+"月2日");
            }else if(day==30){
                System.out.println("上一天日期为"+year+"年"+month+"月29日");
                System.out.println("下一天日期为"+year+"年"+(month+1)+"月"+"1日");
            }else{
                System.out.println("上一天日期为"+year+"年"+month+"月"+(day-1)+"日");
                System.out.println("下一天日期为"+year+"年"+month+"月"+(day+1)+"日");
            }
        }else if(month==12){
            if(day==1){
                System.out.println("上一天日期为"+year+"年"+(month-1)+"月31日");
                System.out.println("下一天日期为"+year+"年12月2日");
            }else if(day==30){
                System.out.println("上一天日期为"+year+"年"+month+"月29日");
                System.out.println("下一天日期为"+(year+1)+"年1月"+"1日");
            }else{
                System.out.println("上一天日期为"+year+"年"+month+"月"+(day-1)+"日");
                System.out.println("下一天日期为"+year+"年"+month+"月"+(day+1)+"日");
            }
        }else{
            if(day==1){
                System.out.println("上一天日期为"+year+"年"+(month-1)+"月30日");
                System.out.println("下一天日期为"+year+"年"+month+"月2日");
            }else if(day==31){
                System.out.println("上一天日期为"+year+"年"+month+"月30日");
                System.out.println("下一天日期为"+year+"年"+(month+1)+"月1日");
            }else{
                System.out.println("上一天日期为"+year+"年"+month+"月"+(day-1)+"日");
                System.out.println("下一天日期为"+year+"年"+month+"月"+(day+1)+"日");
            }
        }
    }
}
