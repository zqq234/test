package BaoZiPu1;

import BaoZiPu1.BaoZi;

/**
 * @className BaoZiPu1.BaoZiPu
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/1/28 17:27
 * @Version 1.0
 **/
public class BaoZiPu extends Thread{
    private BaoZi bz;
    public BaoZiPu(BaoZi bz){
        this.bz=bz;
    }
    public void run(){
        int count=0;
        synchronized (bz){
            while(true){
                if(bz.flag==true){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if(count%2==0){
                    bz.pi="薄皮";
                    bz.xian="三鲜馅";
                }else{
                    bz.pi="冰皮";
                    bz.xian="牛肉大葱馅";
                }
                count++;
                System.out.println("包子铺正在生产："+bz.pi+bz.xian+"包子");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.flag=true;
                bz.notify();
                System.out.println("包子铺已经生产好了:"+bz.pi+bz.xian+"包子，可以开吃了");
            }
        }
    }
}
