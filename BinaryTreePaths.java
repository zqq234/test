class BinaryTreePaths{
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res=new ArrayList<>();
        dfs(root,"",res);
        return res;
    }
    public void dfs(TreeNode root,String str,List<String> res){
        if(root!=null){
            str+=String.valueOf(root.val);
            if(root.left==null&&root.right==null){
                res.add(str);
            }else{
                str+="->";
                dfs(root.left,str,res);
                dfs(root.right,str,res);
            }
        }
    }
}