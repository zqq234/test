import java.util.Arrays;

/**
 * @className MyPriorityQueue
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/3/21 15:53
 * @Version 1.0
 **/
public class MyPriorityQueue {
    private int[] array;
    private int size;

    public MyPriorityQueue(){
        array=new int[11];
        size=0;
    }
    public MyPriorityQueue(int initCapacity){
        if(initCapacity<1){
            initCapacity=11;
        }
        array=new int[initCapacity];
        size=0;
    }
    public MyPriorityQueue(int[] arr){
        int size=arr.length;
        array=new int[size];
        for(int i=0;i<size;i++){
            array[i]=arr[i];
        }
        for(int i=(size-2)/2;i>=0;i--){
            shiftDown(i);
        }
    }
    private void shiftDown(int parent){
        int child=parent*2+1;
        while(child<size)
        if(child+1<size&&array[child+1]<array[child]){
            child+=1;
        }
        if(array[child]<array[parent]){
            int tmp=array[parent];
            array[parent]=array[child];
            array[child]=tmp;
            parent=child;
            child=parent*2+1;
        }else{
            return;
        }
    }
    int peek(){
        return array[0];
    }
    int size(){
        return size;
    }
    void clear(){
        size=0;
    }
    void grow(){
        if(size>=array.length){
            int oldCapacity=size;
            int newCapacity=(oldCapacity+((oldCapacity<64)?(oldCapacity+2):oldCapacity>>2));
            array=Arrays.copyOf(array,newCapacity);
        }
    }
    boolean offer(int x){
        grow();
        array[size++]=x;
        int child=size-1;
        int parent=(child-1)/2;
        while(parent>=0){
            if(array[parent]>array[child]){
                int tmp=array[child];
                array[child]=array[parent];
                array[parent]=tmp;
                child=parent;
                parent=(child-1)/2;
            }
        }
        return true;
    }
    int poll(){

        return 0;
    }
    boolean isEmpty(){
        return 0==size;
    }
    public static void main(String[] args) {
        int array[]={5,3,7,1,4,6,8,0,2};
        MyPriorityQueue q=new MyPriorityQueue(array);
    }
}
