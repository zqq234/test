/**
 * @className ShellSort
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/3/27 13:42
 * @Version 1.0
 **/
public class ShellSort {
    public static void sort(int[] arr){
        int gap=arr.length;
        while(gap>0){
            gap=gap/3+1;
            for(int i=gap;i<arr.length;i++){
                int key=arr[i];
                int flag=i-gap;
                while(flag>=0&&arr[flag]>key){
                    arr[flag+gap]=arr[flag];
                    flag-=gap;
                }
                arr[flag+gap]=key;
            }
            gap--;
        }

    }
    public static void main(String[] args) {
        int[] arr={6,4,8,2,0,7,1,3};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
