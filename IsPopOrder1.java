import java.util.*;

public class IsPopOrder{
    public boolean IsPopOrder(int [] pushA,int [] popA) {
      Stack<Integer> s=new Stack<>();
        int j=0;
        for(int i=0;i<pushA.length;i++){
            if(pushA[i]!=popA[j]){
                s.push(pushA[i]);
            }else{
                j++;
                while(!s.isEmpty()&&s.peek()==popA[j]){
                    s.pop();
                    j++;
                }
            }
        }
        return s.isEmpty();
    }
}