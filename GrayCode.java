import java.util.*;

public class GrayCode {
    public String[] getGray(int n) {
        // write code here
        String[] ret=null;
        if(n==1){
            ret=new String[]{"0","1"};
        }else{
            String[] temp=getGray(n-1);
            int len=temp.length;
            ret=new String[len*2];
            for(int i=0;i<len;i++){
                ret[i]="0"+temp[i];
                ret[len*2-1-i]="1"+temp[i];
            } 
        }
        return ret;
    }
}