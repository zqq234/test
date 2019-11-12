class ListNode{
    public int data;
    public ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next=null;
    }
}
public class RemoveAll {
    public ListNode head;
    public void removeAll(int key){
        ListNode prev=this.head;
        ListNode cur=prev.next;
        while(cur!=null){
            if(prev.next.data==key){
                prev.next=cur.next;
                cur=cur.next;
            }else{
                prev=cur;
                cur=cur.next;
            }
        }
        if(this.head.data==key){
            this.head=this.head.next;
        }
    }
}