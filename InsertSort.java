import java.util.Arrays;

/**
 * @className InsertSort
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/3/26 23:25
 * @Version 1.0
 **/
public class InsertSort {
    public static void sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int tmp=arr[i];
            int flag=i-1;
            while(flag>=0&&arr[flag]>tmp){
                arr[flag+1]=arr[flag];
                flag--;
            }
            arr[flag+1]=tmp;
        }
    }
    public static void main(String[] args) {
        int[] arr={7,4,0,9,3,5,2};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
