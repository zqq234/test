/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class MergeKLists2 {
    public ListNode mergeKLists(ListNode[] lists) {
        int len=lists.length;
        if(len==0){
            return null;
        }
        if(len==1){
            return lists[0];
        }
        ListNode head=new ListNode(0);
        ListNode cur=head;
        if(len>1){
            PriorityQueue<ListNode> q=new PriorityQueue<>(len,(n1,n2)->(n1.val-n2.val));
            for(ListNode node:lists){
                if(node!=null){
                    q.offer(node);
                }   
            }
            while(!q.isEmpty()){
                ListNode acur=q.poll();
                cur.next=acur;
                cur=cur.next;
                if(acur.next!=null){
                    q.offer(acur.next);
                }
            }
        }
        return head.next;
    }
}