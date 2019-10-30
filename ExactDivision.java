/**
 * @className ExactDivision
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/10/26 9:27
 * @Version 1.0
 **/
public class ExactDivision {
    public static void main(String[] args) {
        int count=0;
        int i=0;
        while(count<5&&i<=100){
            if(i%7==0){
                System.out.println(i);
                count++;
            }
            i++;
        }
    }
}
