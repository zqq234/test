import java.util.*;
public class Str58 {
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int len=str.length();
        int[]dp=new int[len+1];
        int j=-1;
        int max=0;
        for (int i = 1; i <len ; i++) {
            char x=str.charAt(i-1);
            if(x<='8'&&x>='5'){
                dp[i]=dp[i-1]+1;
                max=Math.max(max,dp[i]);
                if(max==dp[i]){
                    j=i;
                }
            }
        }
        if(max<2)
            return;
        System.out.println(str.substring(j-max,j));
    }
}