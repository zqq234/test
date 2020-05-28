/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class SortedListToBST {
    public ListNode midNode(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        ListNode cur=null;
        while(fast!=null&&fast.next!=null){
            cur=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(cur!=null){
            cur.next=null;
        }
        return slow;
    }
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode mid=midNode(head);
        TreeNode node=new TreeNode(mid.val);
        if(mid==head){
            return node;
        }
        node.left=sortedListToBST(head);
        node.right=sortedListToBST(mid.next);
        return node;
    }
}