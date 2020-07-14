class KthLargest{
    int res,k;
    public int kthLargest(TreeNode root, int k) {
        this.k=k;
        dfs(root);
        return res;
    }
    public void dfs(TreeNode root){
        if(root!=null){
            dfs(root.right);
            k--;
            if(k==0){
                res=root.val;
            }
            dfs(root.left);
        }
    }
}