/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class MinDepth2 {
    private int res;
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        res=Integer.MAX_VALUE;
        func(root,1);
        return res;
    }
    private void func(TreeNode root,int height){
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            if(height<res){
                res=height;
            }
            return;
        }
        func(root.left,height+1);
        func(root.right,height+1);
    }
}