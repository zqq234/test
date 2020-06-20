class BstToGst {
    int sum=0;
    public TreeNode bstToGst(TreeNode root) {
        Stack<TreeNode> stack=new Stack<>();
        TreeNode cur=root;
        while(cur!=null||!stack.isEmpty()){
            while(cur!=null){
                stack.push(cur);
                cur=cur.right;
            }
            TreeNode tmp=stack.pop();
            sum+=tmp.val;
            tmp.val=sum;
            cur=tmp.left;
        }
        return root;
    }
}