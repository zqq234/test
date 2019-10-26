/**
 * @className PrintGraph
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/10/26 15:05
 * @Version 1.0
 **/
public class PrintGraph {
    public static void main(String[] args) {
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=4-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
