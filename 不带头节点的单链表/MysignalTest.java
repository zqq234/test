/**
 * @className MysignalTest
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/10/27 15:46
 * @Version 1.0
 **/
public class MysignalTest {
    public static void main(String[] args) {
        MysignalList mysignalList=new MysignalList();
        mysignalList.addFirst(1);
        mysignalList.addFirst(2);
        mysignalList.addFirst(3);
        mysignalList.display();
        mysignalList.addIndex(2,4);
        mysignalList.display();
    }
}
