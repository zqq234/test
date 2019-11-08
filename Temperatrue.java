/**
 * @className Temperatrue
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/10/26 9:17
 * @Version 1.0
 **/
public class Temperatrue {
    public static void main(String[] args) {
        double s=0.0D;
        int count=1;
        System.out.println("摄氏温度\t华氏温度");
        do{
            double h=s*9/5.0+32;
            System.out.println(s+"\t"+h);
            s+=20;
            count++;
        }while(count<=10&&s<=250);
    }
}
