import java.util.Arrays;

/**
 * @className TestList
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/10/27 11:27
 * @Version 1.0
 **/
public class TestList {
    public static void main(String[] args) {
        MyArrayList myArrayList=new MyArrayList();
        myArrayList.add(0,3);
        myArrayList.add(0,5);
        myArrayList.add(2,4);
        myArrayList.add(2,6);
        myArrayList.add(0,7);
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.getPos(2));
        System.out.println(myArrayList.contains(6));
        myArrayList.display();
        myArrayList.remove(6);
        myArrayList.display();
    }
}
