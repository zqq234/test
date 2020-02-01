/**
 * @className Singleton
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/2/1 22:31
 * @Version 1.0
 **/
public class Singleton {
    private static Singleton instance=new Singleton();
    private Singleton(){
    }
    public static Singleton getInstance(){
        return instance;
    }
}
