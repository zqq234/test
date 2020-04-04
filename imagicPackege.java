import java.util.*;
public class Main{
    public static int imagicPackege(int[]arr,int num,int n){
        if(num==0){
            return 1;
        }
        if(n==0){
            return 0;
        }
        return imagicPackege(arr,num-arr[n],n-1)+imagicPackege(arr,num,n-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n+1];
        arr[0]=0;
        for(int i=1;i<=n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(imagicPackege(arr,40,n));   
    }
}