import java.util.*;
public class HungryXiaoYi{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            int count=0;
            while(n!=0&&count<300000){
                n=(2*n+1)%1000000007;
                count++;
            }
            int res=func(count);
            System.out.println(res<100000?res:-1);
        }
    }
    public static int func(int count){
        if(count%3==0){
            return count/3;
        }
        return count/3+1;
    }
}