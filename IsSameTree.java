class IsSameTree{
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(q!=null&&p!=null){
            return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right)&&(q.val==p.val);
        }else if(q==null&&p==null){
            return true;
        }else{
            return false;
        }
    }
}