import java.util.*;

public class Gift {
    public int getValue(int[] gifts, int n) {
        // write code here
        int temp=gifts[0];
        int count=0;
        for(int i=1;i<n;i++){
            if(temp==gifts[i]){
                count++;
            }else{
                count--;
                if(count<0){
                    temp=gifts[i];
                    count++;
                }
            }
            
        }
        if(count>0)
            return temp;
        else
            return 0;
    }
}