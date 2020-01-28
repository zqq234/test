package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @className ThreadPoolDemo
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/1/28 19:07
 * @Version 1.0
 **/
public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService es= Executors.newFixedThreadPool(2);
        es.submit(new MyRunnable());
        es.submit(new MyRunnable());
        es.shutdown();
    }
}
