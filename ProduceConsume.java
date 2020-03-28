/**
 * @className ProduceConsume
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/3/27 15:33
 * @Version 1.0
 **/
public class ProduceConsume {
    public static volatile int sum;
    private static class Produce implements Runnable{
        @Override
        public void run() {
            try {
                for(int i=0;i<5;i++){
                    synchronized (ProduceConsume.class){
                        if(sum+3>100){
                            ProduceConsume.class.wait();
                        }
                        sum+=3;
                        Thread.sleep(100);
                        System.out.println(Thread.currentThread().getName()+",生产了，库存为："+sum);
                    }
                }
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private static class Consume implements Runnable{
        public void run(){
            try {
                while(true){
                    synchronized (ProduceConsume.class){
                        while(sum==0){
                            ProduceConsume.class.wait();
                        }
                        sum--;
                        Thread.sleep(100);
                        ProduceConsume.class.notify();
                        System.out.println(Thread.currentThread().getName()+",消费了，库存为："+sum);
                        Thread.sleep(100);
                    }
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            new Thread(new Produce(),"生产者"+i).start();
        }
        for(int i=0;i<20;i++){
            new Thread(new Consume(),"消费者"+i).start();
        }
    }
}
