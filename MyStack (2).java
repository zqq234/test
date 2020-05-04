package 具有getMin功能的最小栈;

import java.util.Stack;

public class MyStack {
    Stack<Integer> dataStack;
    Stack<Integer> minStack;
    public MyStack(){
        dataStack=new Stack<>();
        minStack=new Stack<>();
    }
    public void push(int val){
        dataStack.push(val);
        if(minStack.isEmpty()){
            minStack.push(val);
        }else{
            if(val<=minStack.peek()){
                minStack.push(val);
            }
        }
    }
    public int pop(){
        if(!dataStack.isEmpty()){
            int val=dataStack.pop();
            if(val==minStack.peek()){
                minStack.pop();
            }
            return val;
        }
        throw new RuntimeException("栈为空");
    }
    public int getMin(){
        if(minStack.isEmpty()){
            throw new RuntimeException("栈为空");
        }
        return minStack.peek();
    }

    public static void main(String[] args) {
        MyStack s=new MyStack();
        s.push(4);
        s.push(2);
        s.push(5);
        s.push(8);
        s.push(4);
        s.push(1);
        System.out.println(s.getMin());
        System.out.println(s.pop());
        System.out.println(s.getMin());
    }
}
