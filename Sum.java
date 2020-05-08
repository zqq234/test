// write your code here
import java.util.*;
public class Sum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        long[] res=new long[sum+1];
        res[0]=1;
        for(int i=0;i<n;i++){
            for(int j=sum;j>=arr[i];j--){
                res[j]+=res[j-arr[i]];
            }
        }
        System.out.println(res[sum]); 
    }
}