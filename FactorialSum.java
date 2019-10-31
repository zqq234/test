/**
 * @className FactorialSum
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/10/26 9:39
 * @Version 1.0
 **/
public class FactorialSum {
    public static int func(int n){
        int s=1;
        while(n>0){
            s*=n;
            n-=1;
        }
        return s;
    }
    public static void main(String[] args) {
        int n=3;
        int sum=0;
        for (int i = 0; i <=n ; i++) {
            sum=sum+func(i);
        }
        System.out.println(sum);
    }
}
