class MinStack1 {
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
        }else{
            height.push(height.peek());
        }
    }
    
    public void pop() {
        if(!data.isEmpty()){
            data.pop();
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