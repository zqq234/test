public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
class DeleteDuplicate {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur=head;
        while(cur!=null&&cur.next!=null){
            if(cur.val==cur.next.val){
                cur.next=cur.next.next;
            }else{
                cur=cur.next;
            }
        }
        return head;
    }
}