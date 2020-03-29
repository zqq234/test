/**
 * @className MyBlokingQueue
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/3/28 23:40
 * @Version 1.0
 **/
public class MyBlokingQueue<E> {
    private Object[] arr;
    private int size;
    private int put_index;
    private int get_index;

    public MyBlokingQueue(int Capacity){
        arr=new Object[Capacity];
    }
    public synchronized  void put(E x) throws InterruptedException {
        while(size==arr.length){
            wait();
        }
        arr[put_index]=x;
        put_index=(put_index+1)%arr.length;
        size++;
        notifyAll();
    }
    public synchronized E get() throws InterruptedException {
        while(size==0){
            wait();
        }
        E x=(E)arr[get_index];
        size--;
        get_index=(get_index+1)%arr.length;
        notifyAll();
        return x;
    }
    public static void main(String[] args) {
        MyBlokingQueue<Integer> q=new MyBlokingQueue<>(10);
        for(int i=0;i<5;i++){
            final int k=i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int j=0;j<100;j++){
                        try {
                            q.put(k*100+j);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
        }
        while(true){
            try {
                int num=q.get();
                System.out.println(num);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
