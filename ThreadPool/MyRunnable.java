package ThreadPool;

/**
 * @className MyRunnable
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/1/28 19:44
 * @Version 1.0
 **/
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"创建了一个新的线程");
    }
}
