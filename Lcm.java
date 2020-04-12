import java.util.*;
public class Lcm{
    public static int lcm(int a,int b){
        return a*b/gcm(a,b);
    }
    public static int gcm(int a,int b){
        if(b==0){
            return a;
        }
        return gcm(b,a%b);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        System.out.println(lcm(A,B));
    }
}