import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * @className UseBlockingQueue
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/2/2 14:59
 * @Version 1.0
 **/
public class UseBlockingQueue {
    private static BlockingQueue<String> queue=new ArrayBlockingQueue<>(10);
    private static class Producer extends Thread{
        public void run(){
            Random random=new Random(20191116);
            while(true){
                try {
                    int message=random.nextInt(100);
                    queue.put(String.valueOf(message));
                    System.out.println("放入消息："+message);
                    Thread.sleep(random.nextInt(3)*100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    private static class Customer extends Thread{
        @Override
        public void run() {
            Random random=new Random(20191116);
            while(true){
                try {
                    String message=queue.take();
                    System.out.println("收到消息："+message);
                    Thread.sleep(random.nextInt(3)*100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread producer=new Producer();
        Thread customer=new Customer();
        producer.start();
        customer.start();
    }
}
