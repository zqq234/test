import java.util.Scanner;

/**
 * @className Triangle
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/10/26 9:49
 * @Version 1.0
 **/
public class Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入直角三角形的高");
        int height=sc.nextInt();
        int i=0;
        while(i<height){
            int flag=0;
            System.out.print("*");
            int j=i;
            if(i==height-1){
                while(height>0) {
                    System.out.print(" *");
                    height-=2;
                }
                break;
            }
            while(j!=0){
                System.out.print(" ");
                j--;
                flag=1;
            }
            if(flag==1){
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
    }
}
