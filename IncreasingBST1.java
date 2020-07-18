/**
 * Definition for a binary tree node.
class IncreasingBST {
    TreeNode cur;
    public TreeNode increasingBST(TreeNode root) {
        TreeNode head=new TreeNode(-1);
        cur=head;
        dfs(root);
        return head.right;
    }
    public void dfs(TreeNode root){
        if(root!=null){
            dfs(root.left);
            root.left=null;
            cur.right=root;
            cur=root;
            dfs(root.right);
        }
    }
}