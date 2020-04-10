import java.util.*;

public class Robot {
    private int count=0;
    private void func(int r,int d,int x,int y){
        if(r>x||d>y){
            return;
        }
        if(r==x&&d==y){
            count++;
            return;
        }
        func(r+1,d,x,y);
        func(r,d+1,x,y);
    }
    public int countWays(int x, int y) {
        // write code here
        func(1,1,x,y);
        return count;
    }
}