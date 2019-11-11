/**
 * @className DoubleList
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/11/7 15:30
 * @Version 1.0
 **/
class ListNode1{
    public int data;
    public ListNode1 prev;
    public ListNode1 next;

    public ListNode1(int data){
        this.data=data;
    }
}
public class DoubleList {
    public ListNode1 head=null;
    public ListNode1 last=null;
    public void addFirst(int data){
        ListNode1 node=new ListNode1(data);
        if(this.head==null){
            this.head=node;
            this.last=node;
        }else{
            node.next=this.head;
            this.head.prev=node;
            this.head=node;
        }
    }
    public void addLast(int data){
        ListNode1 node=new ListNode1(data);
        if(this.head==null){
            this.last=node;
            this.head=node;
        }else{
            node.prev=this.last;
            this.last.next=node;
            this.last=node;
        }
    }
    public void display(){
        if(this.head==null){
            return;
        }
        ListNode1 cur=this.head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    private  ListNode1 searchIndex(int index){
        if(index<0||index>this.lengthList()||this.head==null){
            return null;
        }
        ListNode1 cur=this.head;
        while(index>0){
            cur=cur.next;
            index--;
        }
            return cur;
    }
    public int lengthList(){
        int len=0;
        ListNode1 cur=this.head;
        while(cur!=null){
            cur=cur.next;
            len++;
        }
        return len;
    }
    public void insert(int index,int data){
        ListNode1 node=new ListNode1(data);
        if(index==0){
            this.addFirst(data);
            return;
        }
        if(index==this.lengthList()){
            this.addLast(data);
            return;
        }
        ListNode1 cur=this.searchIndex(index);
        if(cur==null){
            return;
        }else{
            cur.prev.next=node;
            node.prev=cur.prev;
            node.next=cur;
            cur.prev=node;
        }
    }
    public boolean contains(int key){
        ListNode1 cur=this.head;
        while(cur!=null){
            if(cur.data==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }
    public int remove(int key){
        int oldData=-1;
        ListNode1 cur=this.head;
        if(this.head.data==key){
            oldData=this.head.data;
            this.head=this.head.next;
            this.head.prev=null;
            return oldData;
        }
        while(cur!=null){
            if(cur.data==key&&cur.next!=null){
                oldData=cur.data;
                cur.prev.next=cur.next;
                cur.next.prev=cur.prev;
                return oldData;
            }
            cur=cur.next;
        }
        if(this.last.data==key){
            oldData=this.last.data;
            this.last=this.last.prev;
            this.last.next=null;
            return oldData;
        }
        return oldData;
    }
    public int remove1(int key){
        int oldData=-1;
        ListNode1 cur=this.head;
        while(cur!=null){
            if(cur.data==key){
                oldData=cur.data;
                if(cur==this.head){
                    this.head=this.head.next;
                    this.head.prev=null;
                    return oldData;
                }else{
                    cur.prev.next=cur.next;
                    if(cur!=this.last){
                        cur.next.prev=cur.prev;
                    }else{
                        this.last=cur.prev;
                    }
                    return oldData;
                }
            }
            cur=cur.next;
        }
        return -1;
    }
    public void removeAllKey(int key) {
        int oldData = -1;
        ListNode1 cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                oldData = cur.data;
                if (cur == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;
                } else {
                    cur.prev.next = cur.next;
                    if (cur != this.last) {
                        cur.next.prev = cur.prev;
                    } else {
                        this.last = cur.prev;
                    }

                }
            }
            cur = cur.next;
        }
    }
    public void clear(){
        while(this.head!=null){
            ListNode1 cur=this.head.next;
            this.head.prev=null;
            this.head.next=null;
            this.head=cur;
        }
        this.last=null;
    }

}
