package BaoZiPu1;

/**
 * @className ChiHuo
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/1/28 17:52
 * @Version 1.0
 **/
public class ChiHuo extends Thread {
    private BaoZi bz;
    public ChiHuo(BaoZi bz){
        this.bz=bz;
    }
    public void run(){
        while(true){
            synchronized (bz){
                if(bz.flag==false){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("吃货正在吃："+bz.pi+bz.xian+"的包子");
                bz.flag=false;
                bz.notify();
                System.out.println("吃货已经把："+bz.pi+bz.xian+"的包子吃完了，包子铺开始生产包子");
                System.out.println("------------------------------");
            }
        }
    }
}
