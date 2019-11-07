/**
 * @className SumByn
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/10/26 21:14
 * @Version 1.0
 **/
public class SumByn {
    public static int func(int n){
        if(n==1) {
            return 1;
        }else{
            return  n+func(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(func(5));
    }
}
