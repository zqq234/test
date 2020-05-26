/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newHead=new ListNode(-1);
        ListNode last=newHead;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                ListNode node=new ListNode(l1.val);
                last.next=node;
                l1=l1.next;
            }else{
                ListNode node=new ListNode(l2.val);
                last.next=node;
                l2=l2.next;
            }
            last=last.next;
        }
        if(l1!=null){
            last.next=l1;
        }
        if(l2!=null){
            last.next=l2;
        }
        return newHead.next;
    }
}