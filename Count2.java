import java.util.*;

public class Count2 {
    public int countNumberOf2s(int n) {
        // write code here
        int count=0;
        for(int i=0;i<=n;i++){
            int x=i;
            while(x!=0){
                if(x%10==2){
                    count++;
                }
                x/=10;
            }
        }
        return count;
    }
}