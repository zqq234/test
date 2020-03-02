/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class SwapPairs2 {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode first=head;
        ListNode second=head.next;
        first.next=swapPairs(second.next);
        second.next=first;
        return second;
    }
}


