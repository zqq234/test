import java.util.*;
public class XiaoYi{
    public static int func(int m,int n){
        while(n!=0){
            int temp=m%n;
            m=n;
            n=temp;
        }
        return m;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            int a=sc.nextInt();
            for(int i=0;i<n;i++){
                int b=sc.nextInt();
                if(b<=a){
                    a+=b;
                }else{
                    a+=func(a,b);
                }
            }
            System.out.println(a);
        }
    }
}