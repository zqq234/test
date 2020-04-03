import java.util.*;

public class AntiOrder {
    public int count(int[] A, int n) {
        // write code here
        int sum=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(A[j]<A[i]){
                    sum++;
                }
            }
        }
        return sum;
    }
}