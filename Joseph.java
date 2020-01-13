import java.util.*;
public class Joseph {
    public int getResult(int n) {
     return res(n,2);
    }
    public int res(int n,int m){
        int tmp= n%m==0?n/m:n/m+1;
        if(tmp<=m+1){
            return (tmp-1)*m+1;
           
        }
        int pos=res(tmp,m+1);
        return (pos-2)*m+1;
    }
}