package BaoZiPu1;

/**
 * @className Demo
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/1/28 18:10
 * @Version 1.0
 **/
public class Demo {
    public static void main(String[] args) {
        BaoZi bz=new BaoZi();
        new BaoZiPu(bz).start();
        new ChiHuo(bz).start();
    }
}
