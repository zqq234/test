import java.util.*;

public class AntiOrder {
    public int count(int[] A, int n) {
        if(A==null||n==0){
            return 0;
        }
        return countAnti(A,0,n-1);
    }
    public int countAnti(int[]A,int start,int end){
        if(start==end){
            return 0;
        }
        int mid=start+((end-start)>>1);
        return countAnti(A,start,mid)+countAnti(A,mid+1,end)+merge(A,start,mid,end);
    }
    public int merge(int[]A,int start,int mid,int end){
        int[] temp=new int[end-start+1];
        int index=0;
        int l=start;
        int r=mid+1;
        int count=0;
        while(l<=mid&&r<=end){
            if(A[l]<=A[r]){
                temp[index++]=A[l++];
            }else{
                count+=(mid-l+1);
                temp[index++]=A[r++];
            }
        }
        while(l<=mid){
            temp[index++]=A[l++];
        }
        while(r<=end){
            temp[index++]=A[r++];
            
        }
        System.arraycopy(temp,0,A,start,end-start+1);
        return count;
    }
}