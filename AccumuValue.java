/**
 * @className AccumuValue
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/10/26 11:48
 * @Version 1.0
 **/
public class AccumuValue {
    public static void main(String[] args) {
        int sum=0;
        int i;
        for (i = 1; i <=10 ; i++) {
            sum+=i;
            if(sum>20){
                break;
            }
        }
        System.out.println(i);
    }
}
