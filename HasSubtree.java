public class HasSubtree{
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root2==null||root1==null)
            return false;
        return func(root1,root2)||HasSubtree(root1.left,root2)||HasSubtree(root1.right,root2);
    }
    public boolean func(TreeNode root1,TreeNode root2){
        if(root2==null){
            return true;
        }else if(root1==null){
            return false;
        }else if(root1.val!=root2.val){
            return false;
        }else{
            return func(root1.left,root2.left)&&func(root1.right,root2.right);
        }
    }
}