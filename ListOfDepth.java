/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class ListOfDepth{
    public ListNode[] listOfDepth(TreeNode tree) {
        List<ListNode> res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(tree==null){
            return new ListNode[0];
        }
        q.offer(tree);
        while(!q.isEmpty()){
            int size=q.size();
            ListNode head=new ListNode(-1);
            ListNode tail=head;
            for(int i=0;i<size;i++){
                TreeNode tmp=q.poll();
                ListNode node=new ListNode(tmp.val);
                tail.next=node;
                tail=tail.next;
                if(tmp.left!=null){
                q.offer(tmp.left);
                }
                if(tmp.right!=null){
                    q.offer(tmp.right);
                }
            }
            res.add(head.next);    
        }
        ListNode[] arr=new ListNode[res.size()];
        int flag=0;
        for(ListNode node:res){
            arr[flag++]=node;
        }
        return arr;
    }
}