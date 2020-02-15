/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode cur=head;
        ListNode preCur=null;
        while(cur!=null){
            ListNode curNext=cur.next;
            cur.next=preCur;
            preCur=cur;
            cur=curNext;
        }
        return preCur;
    }
}

