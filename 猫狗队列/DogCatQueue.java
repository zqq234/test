package 猫狗队列;

import java.util.LinkedList;
import java.util.Queue;

public class DogCatQueue {
    private Queue<PetEnterQueue> dog;
    private Queue<PetEnterQueue> cat;
    private long count;

    public DogCatQueue() {
        dog=new LinkedList<>();
        cat=new LinkedList<>();
        count=0;
    }
    public void add(Pet pet){
        if("dog".equals(pet.getType())){
            dog.offer(new PetEnterQueue(pet,count++));
        }else if("cat".equals(pet.getType())){
            cat.offer(new PetEnterQueue(pet,count++));
        }else{
            throw new RuntimeException("不是猫或狗");
        }
    }
    public Pet pollAll(){
        if(!dog.isEmpty()&&!cat.isEmpty()){
            if(dog.peek().getCount()>cat.peek().getCount()){
                return cat.poll().getPet();
            }else{
                return dog.poll().getPet();
            }
        }else{
            throw new RuntimeException("队列为空");
        }
    }
    public Pet pollDog(){
        if(!dog.isEmpty()){
            return dog.poll().getPet();
        }else{
            throw new RuntimeException("队列为空");
        }
    }
    public Pet pollCat(){
        if(!cat.isEmpty()){
            return cat.poll().getPet();
        }else{
            throw new RuntimeException("队列为空");
        }
    }
    public boolean isEmpty(){
        return dog.isEmpty()&&cat.isEmpty();
    }
    public boolean isDogEmpty(){
        return dog.isEmpty();
    }
    public boolean isCatEmpty(){
        return cat.isEmpty();
    }

    public static void main(String[] args) {
        DogCatQueue q=new DogCatQueue();
        q.add(new Dog());
        q.add(new Cat());
        q.add(new Dog());
        q.add(new Dog());
    }
}
