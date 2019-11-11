/**
 * @className DoubleTest
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/11/9 9:56
 * @Version 1.0
 **/
public class DoubleTest {
    public static void main(String[] args) {
        DoubleList doubleList=new DoubleList();
        doubleList.addLast(1);
        doubleList.addLast(2);
        doubleList.addLast(3);
        doubleList.addLast(4);
        doubleList.addLast(5);
        doubleList.insert(5,33);
        System.out.println(doubleList.contains(4));
        System.out.println(doubleList.remove1(5));
        doubleList.display();
        doubleList.clear();
        System.out.println("dfs");
    }
}
