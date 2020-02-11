/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class MaxDepth {
    int count=0;
    TreeNode left;
    TreeNode right;
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int nleft=maxDepth(root.left);
        int nright=maxDepth(root.right);
        return nleft>nright? nleft+1:nright+1;
    }
    

    
}

