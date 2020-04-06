import java.util.*;
public class GongBeiShu1{
    public static int gongBeiShu(int A,int B){
        int t;
        while(B!=0){
            t=B;
            B=A%B;
            A=t;
        }
        return A;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        System.out.println(func(A,B));
    }
}