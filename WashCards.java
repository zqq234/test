import java.util.*;
public class WashCards{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[]arr=new int[n*2];
            for(int m=0;m<2*n;m++){
                int temp=m+1;
                for(int z=0;z<k;z++){
                    if(temp<=n){
                        temp=temp*2-1;
                    }else{
                        temp=(temp-n)*2;
                    }
                }
                arr[temp-1]=sc.nextInt();
            }
            if(n>=1){
                System.out.print(arr[0]);
            }
            for(int j=1;j<2*n;j++){
                System.out.print(" "+arr[j]);
            }
                System.out.println();
        }
    }
}