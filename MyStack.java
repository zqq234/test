class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    private int top;
    /** Initialize your data structure here. */
    public MyStack() {
        q1=new LinkedList();
        q2=new LinkedList();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        q1.add(x);
        top=x;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while(q1.size()>1){
            top=q1.peek();
            q2.add(q1.remove());
        }
        int a=q1.peek();
        q1.remove();
        Queue<Integer> tmp=q1;
        q1=q2;
        q2=tmp;
        return a;
    }
    
    /** Get the top element. */
    public int top() {
        return top;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty()&&q2.isEmpty();
    }
}
