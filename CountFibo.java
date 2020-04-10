import java.util.*;
public class CountFibo{
    private static int fibo(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            int min=0;
            int max=0;
            for(int i=1;;i++){
                int sum=fibo(i);
                if(sum>n){
                    max=sum;
                    break;
                }
                min=sum;
            }
            System.out.println(Math.min(n-min,max-n));
        }
    }
}