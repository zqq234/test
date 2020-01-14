import java.util.*;
public class Joseph2 {
    public int getResult(int n) {
        if(n<=2){
            return 1;
        }
       LinkedList<Integer> list = new LinkedList<>();
        for(int i=1;i<=n;i+=2){
            list.addLast(i);
        }
        int count=3;

        while(count<=n){
           list.addFirst(list.removeLast());
           int k = 1;
           int len = list.size();
           for(int i = 1;i<=len;i++){
               if(i%count!=1){
                   list.remove(i-k);
                   k++;
               }
           }
           if(count>=list.size()){
               return list.getLast();
           }
           count++;
       }
        return 1;
    }
}
