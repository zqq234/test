/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class IsSymmetric{
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        return func(root.left,root.right);
    }
    public boolean func(TreeNode left,TreeNode right){
        if(left==null&&right==null){
            return true;
        }else if(left==null||right==null){
            return false;
        }
        if(left.val!=right.val){
            return false;
        }else{
            return func(left.right,right.left)&&func(left.left,right.right);
        }
    }
}