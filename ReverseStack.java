package 逆序一个栈;

import java.util.Stack;

public class ReverseStack {

    public static int remove(Stack<Integer> s){
        int result=s.pop();
        if(s.isEmpty()){
            return result;
        }else{
            int last=remove(s);
            s.push(result);
            return last;
        }
    }
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int result=remove(s);
        reverse(s);
        s.push(result);
    }

    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        reverse(s);
        System.out.println(s);
    }
}
