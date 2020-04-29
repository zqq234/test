import java.util.*;
public class NumSum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            int s=n;
            int sum=0;
            while(s!=0){
               sum+=s%10;
                s/=10;
            }
            int sum1=0;
            int s1=n*n;
            while(s1!=0){
                sum1+=s1%10;
                s1/=10;
            }
            System.out.println(sum+" "+sum1);
        }
    }
}