 class ListNode{
    public int data;
    public ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next=null;
    }
}
 public class Remove {
    public ListNode head;
  
    public void remove(int key){
        ListNode cur=this.head;
        if(this.head==null){
            System.out.println("Á´±íÎª¿Õ");
            return;
        }
        if(this.head.data==key){
            this.head=this.head.next;
            return;
        }
        ListNode prev=searchPrev(key);
        if(prev==null){
            return;
        }
        prev.next=prev.next.next;
    }
}