package 由两个栈组成队列;

import java.util.Stack;

public class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;
    public MyQueue(){
        s1=new Stack<>();
        s2=new Stack<>();
    }
    public void offer(int val){
        s1.push(val);
    }
    public int poll(){
        if(s1.isEmpty()&&s2.isEmpty()){
            throw new RuntimeException("队列为空");
        }
        if(!s2.isEmpty()){
            return s2.pop();
        }else{
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            return s2.pop();
        }
    }
    public int peek(){
        if(s1.isEmpty()&&s2.isEmpty()){
            throw new RuntimeException("队列为空");
        }
        if(!s2.isEmpty()){
            return s2.peek();
        }else{
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            return s2.peek();
        }
    }

    public static void main(String[] args) {
        MyQueue q=new MyQueue();
        q.offer(4);
        q.offer(2);
        q.offer(8);
        q.offer(45);
        q.offer(0);
        q.offer(3);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
    }
}
