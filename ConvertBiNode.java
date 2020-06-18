/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class ConvertBiNode {
    public TreeNode convertBiNode(TreeNode root) {
        TreeNode head=null;
        TreeNode tail=null;
        Stack<TreeNode> stack=new Stack<>();
        TreeNode node=root;
        while(!stack.isEmpty()||node!=null){
            while(node!=null){
                stack.push(node);
                node=node.left;
            }
            TreeNode tmp=stack.pop();
            if(head==null){
                head=tmp;
                tail=tmp;
            }else{
                tail.right=tmp;
                tail=tail.right;
            }
            tail.left=null;
            node=tail.right;
        }
        return head;
    }
}