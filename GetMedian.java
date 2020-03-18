import java.util.*;
public class GetMedian {
    PriorityQueue<Integer> low=new PriorityQueue<>();
    PriorityQueue<Integer> high=new PriorityQueue<>((o1,o2)->o2-o1);
    int cnt=0;
    public void Insert(Integer num) {
        if((cnt&1)==0){
            low.add(num);
            high.add(low.poll());
        }else{
            high.add(num);
            low.add(high.poll());
        }
        cnt++;
    }

    public Double GetMedian() {
        if((cnt&1)==1){
            return (double)high.peek();
        }else{
            return (low.peek()+high.peek())/2.0;
        }
    }
}