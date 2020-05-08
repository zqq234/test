// write your code here
import java.util.*;
public class Award{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            float fenmu=func1(n);
            float fenzi=func2(n);
            float res=fenzi/fenmu*100;
            System.out.println(String.format("%.2f",res)+"%");
        }
    }
    public static float func1(int n){
        if(n==1){
            return 1;
        }else{
            return n*func1(n-1);
        }
    }
    public static float func2(int n){
        if(n==1){
            return 0;
        }else if(n==2){
            return 1;
        }else{
            return (n-1)*(func2(n-1)+func2(n-2));
        }
    }
}