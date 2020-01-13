public class IsPopOrder {
    public boolean isPopOrder(int [] pushA,int [] popA) {
      Stack<Integer> s=new Stack();
        if(pushA.length==0||popA.length==0||pushA.length!=popA.length){
            return false;
        }
       int flag1=0;
        int flag2=0;
        s.push(pushA[flag1++]);
        while(flag2<=popA.length-1){
            while(s.peek()!=popA[flag2]){
                if(flag1==pushA.length){
                    return false;
                }
               s.push(pushA[flag1++]); 
            }
            flag2++;
            s.pop();
        }
        if(s.empty()){
            return true;
        }else{
            return false;
        }
    }
}