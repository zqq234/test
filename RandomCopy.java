/**
 * @className RandomCopy
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/11/7 17:20
 * @Version 1.0
 **/
class A{
    int data;
    A next;
    A random;
    public A(int data,A next,A random){
        this.data=data;
        this.next=next;
        this.random=random;
    }
}
public class RandomCopy {
    A head;
    public A copyRandomList(){
        if(this.head==null){
            return null;
        }
        A cur=this.head;
        while(cur!=null){
            A node=new A(cur.data,cur.next,null);
            A tmp=cur.next;
            cur.next=node;
            cur=tmp;
        }
        cur=this.head;
        while(cur!=null){
            if(cur.random!=null){
                cur.next.random=cur.random.next;
            }else{
                cur.next.random=null;
            }
            cur=cur.next.next;
        }
        //拆
        cur=this.head;
        A newHead=cur.next;
        while(cur.next!=null){
            A tmp=cur.next;
            cur.next=tmp.next;
            cur=tmp;
        }
        return newHead;
    }
}
