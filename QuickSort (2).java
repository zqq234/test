package 排序;

import java.util.Arrays;

public class QuickSort {
    public static void sort(int[] arr,int left,int right){
        if(right-left>1){
            int par=partion(arr,left,right);
            sort(arr,left,par-1);
            sort(arr,par+1,right);
        }
    }
    public static int partion(int[] arr,int begin,int end){
        int key=arr[end];
        int prev=begin-1;
        while(begin<end){
            if(key>=arr[begin]&&++prev!=begin){
                int temp=arr[begin];
                arr[begin]=arr[prev];
                arr[prev]=temp;
            }
            begin++;
        }
        if(++prev!=end){
            int temp=arr[end];
            arr[end]=arr[prev];
            arr[prev]=temp;
        }
        return prev;
    }
    public static void main(String[] args) {
        int[] arr={9,2,8,0,7,1,3};
        sort(arr,0,6);
        System.out.println(Arrays.toString(arr));
    }
}
