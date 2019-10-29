/**
 * @className EvenSum
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/10/26 9:11
 * @Version 1.0
 **/
public class EvenSum {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 0; i <=100 ; i+=2) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
