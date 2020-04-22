import java.util.*;
public class CountRub{
    private static int func(int n){
        int a=1;
        int b=1;
        int c=a+b;
        for(int i=3;i<=n;i++){
            c=a+b;
            a=b;
            b=c;  
        }
        return b;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            System.out.println(func(n));
        }
    }
}