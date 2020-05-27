/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class DeleteNode {
    public ListNode deleteNode(ListNode head, int val) {
        if(head==null){
            return null;
        }
        if(head.val==val){
            head=head.next;
        }
        ListNode cur=head;
        while(cur!=null&&cur.next!=null){
            if(cur.next.val==val){
                cur.next=cur.next.next;
            }else{
                cur=cur.next;
            }
        }
        return head;
    }
}