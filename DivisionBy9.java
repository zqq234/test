/**
 * @className DivisionBy9
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/10/26 11:51
 * @Version 1.0
 **/
public class DivisionBy9 {
    public static void main(String[] args) {
        int count=0;
        for (int i = 0; i <1000 ; i++) {
            if(i%9==0){
                System.out.print(i+" ");
                count++;
            }
            if(count==5){
                System.out.println();
                count=0;
            }
        }
    }
}
