package lab;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @className 通过计数办法判断任务是否全部完成
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/4/12 21:37
 * @Version 1.0
 **/
public class 通过计数办法判断任务是否全部完成 {
    private static int count=10;
    private static AtomicInteger sucessCount=new AtomicInteger(0);
    private static AtomicInteger failureCount=new AtomicInteger(0);
    private static class Job implements Runnable{
        private void work() throws InterruptedException, IOException {
            Random random=new Random();
            int n=random.nextInt(5);
            if(n<2){
                throw new IOException();
            }
            Thread.sleep(5);
        }

        @Override
        public void run() {
            try {
                work();
                sucessCount.getAndIncrement();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i <count ; i++) {
            Thread thread=new Thread(new Job());
            thread.start();
        }
        while(sucessCount.get()+failureCount.get()!=count){
            Thread.sleep(1000);
            System.out.println("任务还没有完成");
        }
        System.out.println("任务全部完成");
    }
}
