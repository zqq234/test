class MyCircularDeque {
    int[]a;
    int size=0;
    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        a=new int[k];
    }
    
    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if(this.isFull()){
            return false;
        }
        for(int i=this.size;i>0;i--){
            a[i]=a[i-1];
        }
        a[0]=value;
        size++;
        return true;
    }
    
    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if(this.isFull()){
            return false;
        }
        a[size++]=value;
        return true;

    }
    
    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if(this.isEmpty()){
            return false;
        }
        for(int i=1;i<size;i++){
            a[i-1]=a[i];
        }
        size--;
        return true;
    }
    
    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if(this.isEmpty()){
            return false;
        }
        size--;
        return true;
    }
    
    /** Get the front item from the deque. */
    public int getFront() {
        if(this.isEmpty()){
            return -1;
        }
        return a[0];
    }
    
    /** Get the last item from the deque. */
    public int getRear() {
        if(this.isEmpty()){
            return -1;
        }
        return a[size-1];
    }
    
    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        if(this.size==0){
            return true;
        }
        return false;
    }
    
    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        if(a.length==size){
            return true;
        }
        return false;
    }
}
