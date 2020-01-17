class MinStack {
    Stack<Integer> data;
    Stack<Integer> height;
    /** initialize your data structure here. */
    public MinStack() {
        data=new Stack<>();
        height=new Stack<>();
    }
    
    public void push(int x) {
        data.push(x);
        if(height.isEmpty()||height.peek()>=x){
            height.push(x);
        }
    }
    
    public void pop() {
        int x=0;
        if(!data.isEmpty()){
            x=data.pop();
        }
        if(x==height.peek()){
            height.pop();
        }
    }
    
    public int top() {
        return data.peek();
    }
    
    public int getMin() {
        return height.peek();
    }
}
