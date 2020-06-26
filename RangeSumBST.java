class RangeSumBST {
    int sum=0;
    public int rangeSumBST(TreeNode root, int L, int R) {
        inorderPrint(root,L,R);
        return sum;
    }
    public void inorderPrint(TreeNode root,int L,int R){
        if(root!=null){
            inorderPrint(root.left,L,R);
            if(root.val>=L&&root.val<=R){
                sum+=root.val;
            }
            inorderPrint(root.right,L,R);
        }
    }
}