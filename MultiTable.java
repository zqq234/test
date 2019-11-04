/**
 * @className MultiTable
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/10/26 11:03
 * @Version 1.0
 **/
public class MultiTable {
    public static void main(String[] args) {
        for (int i = 1; i <10 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}
