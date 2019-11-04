/**
 * @className OddEven
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/10/26 21:18
 * @Version 1.0
 **/
public class OddEven {
    public static void main(String[] args){
        int n=15;
        int i;
        System.out.println("二进制偶数位：");
        for(i=30;i>=0;i-=2){
            System.out.print((n>>i)&1);
        }
        System.out.println("\n二进制奇数位：");
        for(i=31;i>0;i-=2){
            System.out.print((n>>i)&1);
        }
    }
}
