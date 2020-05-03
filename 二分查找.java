package EveryDayTitle;

public class 二分查找 {
    public static int binarySearch(int[] arr,int left,int right,int k){
        int mid=(left+right)>>1;
        while(left<=right){
            if(arr[mid]<k){
                return binarySearch(arr,mid+1,right,k);
            }else if(arr[mid]==k){
                return k;
            }else{
                return binarySearch(arr,left,mid-1,k);
            }
        }
        return -1;
    }
}
