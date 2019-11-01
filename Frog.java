/**
 * @className Frog
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/10/26 21:22
 * @Version 1.0
 **/
public class Frog {
    public static int frog(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        return frog(n-1)+frog(n-2);
    }
    public static void main(String[] args) {
        System.out.println(frog(5));
    }
}
