class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<Integer>();
        Stack<TreeNode> s=new Stack<>();
        TreeNode cur=root;
        while(cur!=null||!s.isEmpty()){
            while(cur!=null){
                s.push(cur);
                cur=cur.left;
            }
            TreeNode tmp=s.pop();
            res.add(tmp.val);
            cur=tmp.right;
        }
        return res;
    }
}