import java.util.Stack;

public class MyMinStack {

    Stack<Integer> s=new Stack<>();
    Stack<Integer> min=new Stack<>();
    public void push(int node) {
        if(s.isEmpty()){
            s.push(node);
            min.push(node);
        }else{
            if(node<min.peek()){
                min.push(node);
            }else{
                min.push(min.peek());
            }
            s.push(node);
        }
    }
    
    public void pop() {
        s.pop();
        min.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int min() {
        return min.peek();
    }
}