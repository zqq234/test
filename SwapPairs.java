/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class SwapPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        ListNode end=dummy;
        while(end.next!=null){
            int count=0;
            ListNode start=prev.next;
            while(end!=null&&count<2){
                end=end.next;
                count++;
            }
            if(end==null){
                break;
            }
            ListNode next=end.next;
            end.next=null;
            prev.next=reverse(start);
            start.next=next;
            prev=start;
            end=prev;
        }
        return dummy.next;
    }
    private ListNode reverse(ListNode start){
        ListNode prev=null;
        ListNode cur=start;
        while(cur!=null){
            ListNode curNext=cur.next;
            cur.next=prev;
            prev=cur;
            cur=curNext;
        }
        return prev;
    }
}