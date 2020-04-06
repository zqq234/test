import java.util.*;
public class GongBeiShu{
    public static int gongBeiShu(int A,int B){
        int min=Math.min(A,B);
        int max=Math.max(A,B);
        for(int i=1;;i++){
            if(min*i%max==0){
                return min*i;
            }
        } 
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        System.out.println(func(A,B));
    }
}