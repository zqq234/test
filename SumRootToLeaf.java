class SumRootToLeaf{时
    int res=0;
    public int sumRootToLeaf(TreeNode root) {
        int tmp=0;
        dfs(root,tmp);
        return res;
    }
    public void dfs(TreeNode root,int tmp){
        if(root!=null){
            tmp=(tmp<<1)+root.val;
            if(root.left==null&&root.right==null){
                res+=tmp;
            }else{
                dfs(root.left,tmp);
                dfs(root.right,tmp);
            }
        }
    }
}