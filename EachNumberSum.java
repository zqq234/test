/**
 * @className EachNumberSum
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/10/26 20:58
 * @Version 1.0
 **/
public class EachNumberSum {
    public static int s(int n){
        if(n<9){
            return n;
        }
        return n%10+s(n/10);
    }
    public static void main(String[] args) {
        System.out.println(s(134));
    }
}
