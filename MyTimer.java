import java.util.Queue;
import java.util.TimerTask;

/**
 * @className MyTimer
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/3/29 16:01
 * @Version 1.0
 **/
public class MyTimer {
    MyBlokingQueue<MyTimerTask> q=new MyBlokingQueue<>(10);
    public MyTimer(int count){
        for(int i=0;i<count;i++){
            new Thread(new Worker(q)).start();
        }
    }
    public void schedule(Runnable task,long delay,long prieod) throws InterruptedException {
        q.put(new MyTimerTask(task,System.currentTimeMillis()+delay,prieod));
        synchronized (q){
            q.notifyAll();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new MyTimer(3).schedule(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("起床了");
            }
        }),3000,1000);
    }
}
class Worker implements Runnable{
    MyBlokingQueue q;
    public Worker(MyBlokingQueue q){
        this.q=q;
    }
    @Override
    public void run() {
        try {
            while(true){
                MyTimerTask task=(MyTimerTask)q.get();
                synchronized (q){
                    long current=System.currentTimeMillis();
                    if(current<task.next){
                        q.wait(task.next-current);
                        q.put(task);
                    }else{
                        task.task.run();
                        if(task.preiod>0){
                            task.next=task.next+task.preiod;
                            q.put(task);
                        }
                    }
                }
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class MyTimerTask implements Comparable<MyTimerTask>{
    Runnable task;
    long next;
    long preiod;
    public MyTimerTask(Runnable task,long next,long preiod){
        this.task=task;
        this.next=next;
        this.preiod=preiod;
    }
    @Override
    public int compareTo(MyTimerTask o) {
        return (int)(next-o.next);
    }
}