package ThreadPool;

/**
 * @className Lambda
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/1/28 20:33
 * @Version 1.0
 **/
public class Lambda {
    public static void main(String[] args) {
        new Thread(()->{
            System.out.println("创建了一个新线程");
        }).start();
    }
}
