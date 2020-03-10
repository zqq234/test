/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class DiameterOfBinaryTree {
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        func(root);
        return max;
    }
    private int func(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=func(root.left);
        int right=func(root.right);
        max=Math.max(right+left,max);
        return Math.max(left,right)+1;
    }
}