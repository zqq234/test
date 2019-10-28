/**
 * @className contain9
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/10/26 21:21
 * @Version 1.0
 **/
public class contain9 {
    public static int sum(){
        int i;
        int count = 0;
        for (i = 1; i <= 100; i++) {
            if (i % 10 == 9) {
                count++;
                continue;
            } else if ((i / 10) % 10 == 9) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int count=sum();
        System.out.println(count);
    }
}
