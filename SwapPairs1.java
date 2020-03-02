/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class SwapPairs1 {
    public ListNode swapPairs(ListNode head) {
        Stack<ListNode> s=new Stack<>();
        ListNode dummy=new ListNode(0);
        ListNode p=dummy;
        while(true){
            int count=0;
            ListNode cur=head;
            while(count<2&&cur!=null){
                s.push(cur);
                cur=cur.next;
                count++;
            }
            if(count!=2){
                p.next=head;
                break;
            }
            while(!s.isEmpty()){
                p.next=s.pop();
                p=p.next;
            }
            head=cur;
        }
        return dummy.next;
    }
}