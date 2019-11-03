import java.util.Scanner;

/**
 * @className Isrepeat
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/10/25 18:40
 * @Version 1.0
 **/
public class Isrepeat {
    public static void main(String[] args) {
        int[] array=new int[5];
        System.out.println("请输入五个数：");
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            array[i]=sc.nextInt();
        }
        int flag=0;
        for (int i = 0; i <5 ; i++) {
            for (int j = i+1; j <5 ; j++) {
                if(array[i]==array[j]){
                    flag=1;
                    break;
                }
            }
        }
        if(flag==1){
            System.out.println("有重复的数");
        }else{
            System.out.println("没有重复的数");
        }
    }
}
