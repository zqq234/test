class PreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        Stack<TreeNode> s=new Stack<>();
        TreeNode cur=root;
        if(cur==null){
            return res;
        }
        s.push(cur);
        while(!s.isEmpty()){
            TreeNode tmp=s.pop();
            res.add(tmp.val);
            if(tmp.right!=null){
                s.push(tmp.right);
            }
            if(tmp.left!=null)
                s.push(tmp.left);
        }
        return res;
    }
}