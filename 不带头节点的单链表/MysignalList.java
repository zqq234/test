/**
 * @className MysignalList
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/10/27 15:07
 * @Version 1.0
 **/
class ListNode{
    public int data;
    public ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next=null;
    }
}
public class MysignalList {
    public ListNode head;
    public MysignalList(){

    }
    public void addFirst(int data){
        ListNode node=new ListNode(data);
        if (head==null){
            this.head=node;
        }else{
            node.next=this.head;
            this.head=node;
        }
    }
    public void addLast(int data){
        ListNode node=new ListNode(data);
        ListNode cur=this.head;

        if(cur==null){
            cur=node;
        }else{
            while(cur.next!=null){
            cur=cur.next;
            }
            cur.next=node;
        }
    }
    public void display(){
        ListNode cur=this.head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    private ListNode searchIndex(int index){
        ListNode cur=this.head;
        while((index-1)!=0){
            cur=cur.next;
            index--;
        }
        return cur;
    }
    public boolean addIndex(int index,int data){
        ListNode node=new ListNode(data);

        if(index<0||index>getLength()){
            System.out.println("index不合法");
            return false;
        }
        if(index==0){
            addFirst(data);
            return true;
        }
        ListNode cur=searchIndex(index);
        node.next=cur.next;
        cur.next=node;
        return true;
    }
    public int getLength(){
        ListNode cur=this.head;
        int count=0;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }
    public boolean contains(int key){
        ListNode cur=head;
        while(cur!=null){
            if(head.data==key){
                return true;
            }else{
                cur=cur.next;
            }
        }
        return false;
    }
  //内存泄漏
    public void clear(){
        //一个一个置为空
        while(this.head!=null){
            ListNode cur=this.head.next;
            this.head.next=null;
            this.head=cur;
        }
        //this.head=null;

    }


}
