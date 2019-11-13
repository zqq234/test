class ListNode{
    public int data;
    public ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next=null;
    }
}
public class FindKthTail{
    public ListNode findKthToTail(int k){
        if(k<=0||head==null){
            return null;
        }
        ListNode fast=this.head;
        ListNode slow=this.head;
        while(k-1>0){
            if(fast.next!=null){
                fast=fast.next;
                k--;
            }else{
                System.out.println("没有这个节点");
                return null;
            }
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
}