class IsUnivalTree{
    public boolean isUnivalTree(TreeNode root) {
        if(root==null)
            return true;
        return dfs(root,root.val);
    }
    public boolean dfs(TreeNode root,int x){
        if(root!=null){
            if(root.val!=x){
                return false;
            }
            return dfs(root.left,x)&&dfs(root.right,x);
        }
        return true;
    }
}