class ListNode{
    public int data;
    public ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next=null;
    }
}
public class LoopLength{
    public int loopLength(){
        if(this.head==null){
            return 0;
        }
        ListNode fast=this.head;
        ListNode slow=this.head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                int count=1;
                slow=slow.next;
                while(slow!=fast){
                    slow=slow.next;
                    count++;
                }
                return count;
            }
        }
        return 0;
    }
}