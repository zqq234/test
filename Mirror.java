public class Mirror{
    public void Mirror(TreeNode root) {
        func(root);
    }
    public TreeNode func(TreeNode root){
        if(root!=null){
            TreeNode temp=root.left;
            root.left=func(root.right);
            root.right=func(temp);
            return root;
        }
        return null;
    }
}