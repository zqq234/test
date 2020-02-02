import java.util.Timer;
import java.util.TimerTask;

/**
 * @className UseTimer
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/2/2 19:23
 * @Version 1.0
 **/
class MyTimer{
    public void execute(Runnable task,long delay) throws InterruptedException {
        Thread.sleep(delay);
        task.run();
    }
}
public class UseTimer {
    private static class MyTimerTask extends TimerTask{
        @Override
        public void run() {
            System.out.println("已经该起床了");
        }
    }
    public static void main(String[] args) {
        Timer timer=new Timer();
        timer.schedule(new MyTimerTask(),5000);
        timer.scheduleAtFixedRate(new MyTimerTask(),1000,1000);
    }
}
