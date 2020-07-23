class IsBalanced{
    public boolean isBalanced(TreeNode root) {
        if(root!=null){
            return isBalanced(root.left)&&isBalanced(root.right)&&Math.abs(height(root.left)-height(root.right))<2;
        }
        return true;
    }
    public int height(TreeNode root){
        if(root!=null){
            return Math.max(height(root.left),height(root.right))+1;
        }
        return 0;
    }
}