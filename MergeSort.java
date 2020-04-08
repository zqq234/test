public class MergeSort {
    public static void main(String[] args) {
        int[] arr={6,4,8,2,0,7,1,3};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    private static void merge(int[] arr,int left,int mid,int right){
        int[] tmp=new int[right-left+1];
        int index=0;
        int p1=left;
        int p2=mid+1;
        while(p1<=mid&&p2<=right){
            if(arr[p1]<=arr[p2]){
                tmp[index++]=arr[p1++];
            }else{
                tmp[index++]=arr[p2++];
            }
        }
        while(p1<=mid){
            tmp[index++]=arr[p1++];
        }
        while(p2<=right){
            tmp[index++]=arr[p2++];
        }
        System.arraycopy(tmp,0,arr,left,tmp.length);
    }
    private static void sort(int[] arr) {
        mergeSort(arr,0,arr.length-1);
    }

    private static void mergeSort(int[] arr, int start, int end) {
        if(end-start>0){
            int mid=start+((end-start)>>1);
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }
}
