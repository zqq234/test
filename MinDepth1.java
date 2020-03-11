/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class MinDepth1 {
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
        int h1=minDepth(root.left);
        int h2=minDepth(root.right);
        if(root.left==null||root.right==null){
            return h1+h2+1;
        }
        return Math.min(h1,h2)+1;
    }
}