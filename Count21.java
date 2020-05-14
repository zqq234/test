import java.util.*;

public class Count2 {
    public int countNumberOf2s(int n) {
        // write code here
        int count=0;
        if(n==0)
            return 0;
        for(int i=1;i<=n;i*=10){
            int a = n / i,b = n % i;
            count += (a + 7) / 10 * i + ((a % 10 == 2) ? b + 1 : 0);
        }
        return count;
    }
}