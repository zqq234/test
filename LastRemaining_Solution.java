import java.util.*;
public class LastRemaining_Solution {
    public int LastRemaining_Solution(int n, int m) {
        if(n==0){
            return -1;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            q.offer(i);
        }
        while(q.size()>1){
            int count=0;
            while(count!=m-1){
                q.offer(q.poll());
                count++;
            }
            q.poll();
        }
        return q.poll();
    }
}