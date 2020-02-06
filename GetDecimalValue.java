/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class GetDecimalValue {
    public int getDecimalValue(ListNode head) {
        int s=0;
        while(head!=null){
            s=(s<<1)+head.val;
            head=head.next;
        }
        return s;
    }
}