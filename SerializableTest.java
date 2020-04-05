package lesson1;

import org.junit.Test;

import java.io.*;

/**
 * @className SerializableTest
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/4/5 16:58
 * @Version 1.0
 **/

public class SerializableTest {
    public static void main(String[] args) throws Exception {
        Person person=new SerializableTest.Person();
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:/person"));
        oos.writeObject(person);
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D://person"));
        Person person1=(Person)ois.readObject();
        System.out.println(person1);
    }
    private static class Person implements Serializable{
        private String name;
        private Integer age;
    }
}
