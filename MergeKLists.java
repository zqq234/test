/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        int min=Integer.MAX_VALUE;
        int mark=-1;
        for(int i=0;i<lists.length;i++){
            if(lists[i]!=null&&lists[i].val<min){
                min=lists[i].val;
                mark=i;
            }
        }
        if(mark==-1){
            return null;
        }
        ListNode node=lists[mark];
        lists[mark]=lists[mark].next;
        node.next=mergeKLists(lists);
        return node;
    }
}