/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class IsBalanced {
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }else{
            return isBalanced(root.left)&&isBalanced(root.right)&&(Math.abs(height(root.left)-height(root.right))<=1);
        }
    }
    private int height(TreeNode root){
        if(root==null){
            return 0;
        }else{
            return Math.max(height(root.left),height(root.right))+1;
        }
    }
}