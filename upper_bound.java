import java.util.*;
public class Solution {
    /**
     * 二分查找
     * @param n int整型 数组长度
     * @param v int整型 查找值
     * @param a int整型一维数组 有序数组
     * @return int整型
     */
    public int upper_bound_ (int n, int v, int[] a) {
        // write code here
        int low=0,high=a.length-1;
        int mid=0;
        if( a.length== 0 || low > high)  
            return n+1; 
        while(low<=high){
            mid=(low+high)/2;
            if(a[mid]<v){
                low=mid+1;
            }else{
              if(mid==0||a[mid-1]<v) return mid+1;
               else
                    high=mid-1;
            }
        }
       return n+1;    
    }
}