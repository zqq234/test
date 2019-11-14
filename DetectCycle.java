class ListNode{
    public int data;
    public ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next=null;
    }
}
public class DetectCycle{
    public ListNode detectCycle(){
        ListNode fast=this.head;
        ListNode slow=this.head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                fast=this.head;
                while(fast!=slow){
                    fast=fast.next;
                    slow=slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}