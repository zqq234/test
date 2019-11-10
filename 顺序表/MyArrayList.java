import java.util.Arrays;

/**
 * @className MyArrayList
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/10/27 11:13
 * @Version 1.0
 **/
public class MyArrayList {
    public int usedSize;
    public int[] elem;
    public final int CAPACITY=4;

    public MyArrayList() {
        this.usedSize = 0;
        this.elem = new int[CAPACITY];
    }
    private boolean isFull(){
        if(this.usedSize==this.elem.length){
            return true;
        }else{
            return false;
        }
    }

    public void add(int pos,int data){
        if(isFull()){
            this.elem=Arrays.copyOf(this.elem,CAPACITY*2);
        }
        if(pos>this.usedSize||pos<0){
            throw new IndexOutOfBoundsException("位置不合法");
            //System.out.println("插入不合法");
            //return;
        }
        else{
            for (int i = usedSize; i >pos ; i--) {
                elem[i]=elem[i-1];
            }
            elem[pos]=data;
            usedSize++;
        }
    }
    public boolean isEmpty(){
        return this.usedSize==0;
    }
    public void remove(int toRemove){
        if(isEmpty()||!contains(toRemove)){
            return;
        }else{
            for (int i = search(toRemove); i <this.usedSize-1 ; i++) {
                elem[i]=elem[i+1];
            }
            this.usedSize--;
        }
    }
    public boolean contains(int toFind) {
        for (int i = 0; i <this.usedSize ; i++) {
            if(toFind==this.elem[i]){
                return true;
            }
        }
        return  false;
    }

    public int search(int toFind){
        for (int i = 0; i <this.usedSize ; i++) {
            if(toFind==elem[i]){
                return i;
            }
        }
        return -1;
    }

    public int getPos(int pos){
        if(pos<0||pos>this.usedSize){
            System.out.println("位置不合法");
            return -1;
        }else{
            return this.elem[pos];
        }
    }

    public int size(){
        return this.usedSize;
    }
    public  void clear(){
        this.usedSize=0;
    }

    public void display(){
        for (int i = 0; i <this.usedSize ; i++) {
            System.out.print(elem[i]+" ");
        }
        System.out.println();
    }
}
