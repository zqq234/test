/**
 * @className Person
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/10/26 17:23
 * @Version 1.0
 **/
public class Person {
    String name;
    int age;
    int sno;
    public Person(){
    }
    public Person(String name){
        this.name=name;
    }
    public Person(String name,int age,int sno){
        this.name=name;
        this.age=age;
        this.sno=sno;
    }

    public static void main(String[] args) {
        Person p1=new Person();
        Person p2=new Person("张三");
        Person p3=new Person("李四",12,123232);
        System.out.println(p2.name);
        System.out.println(p3.sno);
    }
}
