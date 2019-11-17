import java.util.Arrays;
import java.util.Scanner;

/**
 * @className ThreeComposite
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/11/17 14:44
 * @Version 1.0
 **/
public class ThreeComposite {
    public  static int func(int[] array){
        int count=0;
        int flag=0;
        for (int i = 0; i <array.length ; i++) {
            for(int j=2;j<array[i];j++){
                if(array[i]%j==0){
                    flag++;
                    break;
                }
                if(j==array[i]-1){
                    flag=0;
                }
            }

            if(flag==3){
                count++;
                flag=0;
                i-=2;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count=scanner.nextInt();
        int[] arr=new int[count];
        for (int i = 0; i <count ; i++) {
            arr[i]=scanner.nextInt();
        }
        System.out.println(func(arr));
        System.out.println(Arrays.toString(arr));
    }
}
