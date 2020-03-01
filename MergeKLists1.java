/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class MergeKLists1 {
    public ListNode mergeKLists(ListNode[] lists) {
        int len=lists.length;
        if(len==0){
            return null;
        }
        while(len>1){
            for(int i=0;i<len/2;i++){
                lists[i]=mergeTwo(lists[i],lists[len-1-i]);
            }
            len=(len+1)/2;
        }
        return lists[0];
    }
    public ListNode mergeTwo(ListNode node1,ListNode node2){
        ListNode head=new ListNode(0);
        ListNode last=head;
        while(node1!=null&&node2!=null){
            if(node1.val<node2.val){
                last.next=node1;
                last=last.next;
                node1=node1.next;
            }else{
                last.next=node2;
                last=last.next;
                node2=node2.next;
            }
        }
        if(node1!=null){
            last.next=node1;
        }
        if(node2!=null){
            last.next=node2;
        }
        return head.next;
    }
}