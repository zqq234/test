import java.util.*;
public class NoTwo1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
            int m=sc.nextInt();
            int n=sc.nextInt();
            int res=0;
            int evenCount=(n/4*2)+((n%4)>2?2:(n%4));
            int oddCount=(n-2)/4*2+((n-2)%4>2?2:((n-2)%4));
            res=(m/4)*(evenCount+oddCount)*2;
            if((m%4)>0)
                res+=evenCount;
            if((m%4)>1)
                res+=evenCount;
            if((m%4)>2)
                res+=oddCount;
            System.out.println(res);
   
        
    }
}