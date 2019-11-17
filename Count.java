/**
 * @className Count
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/11/17 14:28
 * @Version 1.0
 **/
public class Count {
    public static int count(int n){
        int count=0;
        for (double i = 1; i <=n ; i++) {
            for (double j = 1; j <=i ; j++) {
                if(i/j==j){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(count(50));
    }
}
