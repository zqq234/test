import java.io.*;
import java.util.ArrayList;

/**
 * @className Serial
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/1/31 20:50
 * @Version 1.0
 **/
public class Serial {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Person> list=new ArrayList<>();
        list.add(new Person("zhangsan",13));
        list.add(new Person("lisi",17));
        list.add(new Person("wangwu",14));
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("d:\\a.txt"));
        oos.writeObject(list);
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("d:\\t.txt"));
        Object o=ois.readObject();
        ArrayList<Person> list2=(ArrayList<Person>)o;
        for(Person p:list2){
            System.out.println(p);
        }
        ois.close();
        oos.close();
    }
}
