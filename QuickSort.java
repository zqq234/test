public class QuickSort {
    public static void sort(int[] arr,int left,int right){
        if((right-left)>0){
            int div=partion(arr,left,right);
            sort(arr,left,div-1);
            sort(arr,div+1,right);
        }
    }
    public static void exchange(int[] arr,int x,int y){
        int tmp=arr[x];
        arr[x]=arr[y];
        arr[y]=tmp;
    }
    public static int partion(int[]arr,int left,int right){
        int key=right;
        while(left<right){
            while(left<right&&arr[left]<=arr[key]){
                left++;
            }
            while(left<right&&arr[right]>=arr[key]){
                right--;
            }
            if(left<right){
                exchange(arr,left,right);
            }
        }
        exchange(arr,key,left);
        return left;
    }
    public static void main(String[] args) {
        int[] arr={6,4,8,2,0,7,1,3};
        sort(arr,0,7);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

