public class QuickSort1 {
    public static void sort(int[] arr,int left,int right){
        if((right-left)>0){
            int div=partion2(arr,left,right);
            sort(arr,left,div-1);
            sort(arr,div+1,right);
        }
    }
    public static void exchange(int[] arr,int x,int y){
        int tmp=arr[x];
        arr[x]=arr[y];
        arr[y]=tmp;
    }
 public static int partion1(int[] arr,int left,int right){
        int key=arr[left];
        while(left<right){
            while(left<right&&arr[right]>key){
                right--;
            }
            arr[left]=arr[right];
            while(left<right&&arr[left]<key){
                left++;
            }
            arr[right]=arr[left];
        }
        arr[left]=key;
        return left;
    }
 public static void main(String[] args) {
        int[] arr={9,2,8,0,7,1,3};
        sort(arr,0,6);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}