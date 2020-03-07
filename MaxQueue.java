class MaxQueue {
    Queue<Integer> q;
    Deque<Integer> qq;
    public MaxQueue() {
        q=new LinkedList<>();
        qq=new LinkedList<>();
    }
    
    public int max_value() {
        if(qq.isEmpty()){
            return -1;
        }else{
            return qq.peek();
        }
        
    }
    
    public void push_back(int value) {
        q.offer(value);
        while(qq.size()>0&&qq.peekLast()<value){
            qq.pollLast();
        }
        qq.offer(value);
    }
    
    public int pop_front() {
        int tmp=q.size()>0?q.poll():-1;
        if(qq.size()>0&&tmp==qq.peek()){
            qq.poll();
        }
        return tmp;
    }
}
