/**
 * @className SelectSort
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/3/27 11:10
 * @Version 1.0
 **/
public class SelectSort {
    public static void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if (arr[j] < arr[min]) {
                    min=j;
                }
            }
            int tmp=arr[min];
            arr[min]=arr[i];
            arr[i]=tmp;
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
