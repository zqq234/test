/**
 * @className SelectSort1
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/3/27 14:14
 * @Version 1.0
 **/
public class SelectSort1 {
    public static void sort(int[] arr){
        int right=arr.length-1;
        int left=0;

        while(left<right){
            int min=left;
            int max=right;
            int index=left;
            while(index<=right){
                if(arr[index]>arr[max]){
                    max=index;
                }
                if(arr[index]<arr[min]){
                    min=index;
                }
                index++;
            }
            exchange(arr,left,min);
            exchange(arr,right,max);
            left++;
            right--;
        }
    }
    public static void exchange(int[] arr,int i,int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
    public static void main(String[] args) {
        int[] arr={6,4,8,2,0,7,1,3,1};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
