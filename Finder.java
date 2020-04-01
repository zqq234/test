import java.util.*;

public class Finder {
    public int findKth(int[] a, int n, int K) {
        // write code here
        return findKth(a,0,n-1,K);
    }
    public int findKth(int[] a,int begin,int end,int K){
        int par=partion(a,begin,end);
        if(K==par-begin+1){
            return a[par];
        }else if(K>(par-begin+1)){
            return findKth(a,par+1,end,K-par+begin-1);
        }else{
            return findKth(a,begin,par-1,K);
        }
    }
    public int partion(int[] a,int begin,int end){
        int key=a[begin];
        while(begin<end){
            while(end>begin&&a[end]<key){
                end--;
            }
            a[begin]=a[end];
            while(begin<end&&a[begin]>key){
                begin++;
            }
            a[end]=a[begin];
        }
        a[begin]=key;
        return begin;
    }
}