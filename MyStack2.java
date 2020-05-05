package 具有getMin功能的最小栈;

import java.util.Stack;

public class MyStack2 {
    Stack<Integer> dataStack;
    Stack<Integer> minStack;
    public MyStack2(){
        dataStack=new Stack<>();
        minStack=new Stack<>();
    }
    public void push(int val){
        dataStack.push(val);
        if(minStack.isEmpty()){
            minStack.push(val);
        }else if(minStack.peek()<=val){
            minStack.push(minStack.peek());
        }else{
            minStack.push(val);
        }
    }
    public int pop(){
        if(dataStack.isEmpty()){
            throw new RuntimeException("栈为空");
        }
        minStack.pop();
        return dataStack.pop();
    }
    public int getMin(){
        if(minStack.isEmpty()){
            throw  new RuntimeException("栈为空");
        }
        return minStack.peek();
    }
    public static void main(String[] args) {
        MyStack2 s=new MyStack2();
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
