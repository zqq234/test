/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class FindKthToTail{
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null)
            return null;
        ListNode slow=head;
        ListNode fast=head;
        while(k!=1){
            fast=fast.next;
            if(fast==null)
                return null;
            k--;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}