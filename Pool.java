import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @className Pool
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/2/1 20:25
 * @Version 1.0
 **/
public class Pool {
    private BlockingQueue<Runnable> workQueue=new ArrayBlockingQueue<>(10);
    private Thread[] workers=new Thread[5];

    Pool(){
        for (int i = 0; i < 5; i++) {
            workers[i]=new Worker(workQueue);
            workers[i].start();
        }
    }
    public void execute(Runnable cmd) throws InterruptedException {
        workQueue.put(cmd);
    }
    private static class Worker extends Thread{
        BlockingQueue<Runnable> workQueue;
        Worker(BlockingQueue<Runnable> queue){
            workQueue=queue;
        }

        @Override
        public void run() {
            while(!isInterrupted()){
                try{
                    Runnable cmd=workQueue.take();
                    cmd.run();
                }catch(InterruptedException e){
                    break;
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Pool pool=new Pool();
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("第一个事情");
            }
        });
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("第二个事情");
            }
        });
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("第三个事情");
            }
        });
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("第四个事情");
            }
        });
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("第五个事情");
            }
        });
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("第六个事情");
            }
        });
    }
}
