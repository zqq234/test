/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class GetKthFromEnd1 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        List<ListNode> list=new ArrayList<>();
        while(head!=null){
            list.add(head);
            head=head.next;
        }
        return list.get(list.size()-k);
    }
}