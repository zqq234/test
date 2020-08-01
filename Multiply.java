import java.util.ArrayList;
public class Multiply {
    public int[] multiply(int[] A) {
        int n=A.length;
        int[] B=new int[n];
        int[]C=new int[n];
        B[0]=1;
        for(int i=1;i<n;i++){
            B[i]=A[i-1]*B[i-1];
        }
        C[n-1]=1;
        for(int i=n-2;i>=0;i--){
            C[i]=A[i+1]*C[i+1];
            B[i]=C[i]*B[i];
        }
        return B;
    }
}