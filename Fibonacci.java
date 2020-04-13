import java.util.*;
public class Fibonacci{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,c=1;
        while(c<n){
            a=b;
            b=c;
            c=a+b;
        }
        System.out.println((n-b)>(c-n)?(c-n):(n-b));
    }
}