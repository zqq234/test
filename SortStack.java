package 用一个栈实现另一个栈的排序;

import java.util.Stack;

public class SortStack {
    public static void sort(Stack<Integer> stack){
        Stack<Integer> help=new Stack<>();
        while(!stack.isEmpty()){
            int cur=stack.pop();
            while(!help.isEmpty()&&help.peek()<cur){
                stack.push(help.pop());
            }
            help.push(cur);
        }
        while(!help.isEmpty()){
            stack.push(help.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(6);
        stack.push(5);
        stack.push(4);
        stack.push(1);
        stack.push(0);
        stack.push(9);
        stack.push(4);
        sort(stack);
        System.out.println(stack);
    }
}
