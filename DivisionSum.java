/**
 * @className DivisionSum
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/10/26 11:07
 * @Version 1.0
 **/
public class DivisionSum {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 0; i <=1000 ; i++) {
            if((i%4==0)&&(i%5==0)&&(i%3!=0)){
                sum+=i;
            }
        }
        System.out.println("1000以内能被4,5整除，不被3整除的和为"+sum);
    }
}
