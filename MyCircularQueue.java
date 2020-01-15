class MyCircularQueue {
    int[] a;
    int front;
    int rear;
    int size;
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        a=new int[k+1];
       front=rear=0;
       size=k+1;
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        a[rear]=value;
        rear=(rear+1)%size;
        return true;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        front=(front+1)%size;
        return true;
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        if(isEmpty()){
            return -1;
        }
       return a[front]; 
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return a[(rear-1+size)%size];
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        if(front==rear){
            return true;
        }
        return false;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        if((rear+1)%size==front){
            return true;
        }
        return false;
    }
}
