package 猫狗队列;

public class Pet {
    private String type;
    public Pet(String type){
        this.type=type;
    }
    public String getType(){
        return type;
    }
}
class Cat extends Pet{
    public Cat(){
        super("cat");
    }
}
class Dog extends Pet{
    public Dog(){
        super("dog");
    }
}