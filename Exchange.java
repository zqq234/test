/**
 * @className Exchange
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/10/26 17:31
 * @Version 1.0
 **/
public class Exchange {
    int a=2;
    int b=4;
    public static void func(Exchange p){
        int temp=p.a;
        p.a=p.b;
        p.b=temp;
    }

    public static void main(String[] args) {
        Exchange p=new Exchange();
        func(p);
        System.out.println(p.a);
        System.out.println(p.b);
    }
}
