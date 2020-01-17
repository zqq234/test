class MyStack1 {
    Queue<Integer> q;
    
    /** Initialize your data structure here. */
    public MyStack() {
        q=new LinkedList<>();
   
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
     
        q.offer(x);
    }
    public void shift(){
        for(int i=0;i<q.size()-1;i++){
            q.offer(q.poll());
        }
    }
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        shift();
        return q.poll();
    }
    
    /** Get the top element. */
    public int top() {
        shift();
        int x=q.poll();
        q.offer(x);
        return x;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q.isEmpty();
    }
}
1