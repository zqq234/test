/**
 * @className MyThreadPool
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/3/29 15:05
 * @Version 1.0
 **/
public class MyThreadPool {
    private MyBlokingQueue<Runnable> queue;
    public MyThreadPool(int size,int capacity){
        queue=new MyBlokingQueue<>(capacity);
        for(int i=0;i<size;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while(true){
                        try {
                            Runnable task= queue.get();
                            task.run();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
        }
    }
    public void execute(Runnable task) throws InterruptedException {
        queue.put(task);
    }

    public static void main(String[] args) throws InterruptedException {
        MyThreadPool pool=new MyThreadPool(3,10);
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("A");
            }
        });
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("B");
            }
        });
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("C");
            }
        });
    }
}
