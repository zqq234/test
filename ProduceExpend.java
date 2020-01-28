/**
 * @className ProduceExpend
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/1/27 22:00
 * @Version 1.0
 **/
public class ProduceExpend {
    public static void main(String[] args) {
        Object obj=new Object();
        new Thread(){
            public void run(){
                while(true) {
                    synchronized (obj) {
                        System.out.println("告知老板要的包子数量");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("包子做好，开吃");
                        System.out.println("----------------------");
                    }
                }
            }
        }.start();
        new Thread(){
            public void run(){
                while(true){
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj){
                        System.out.println("5秒钟包子做好了，可以吃包子了");
                        obj.notify();
                    }
                }

            }
        }.start();
    }
}
