/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class SwapPairs3 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode cur=dummy;
        while(head!=null&&head.next!=null){
           ListNode first=head;
           ListNode second=head.next;
           cur.next=second;
           first.next=second.next;
           second.next=first;
           cur=first;
           head=first.next;
        }
        return dummy.next;
    }
}

