public class IsBalanced_Solution{
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null){
            return true;
        }
        return IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right)&&Math.abs(height(root.left)-height(root.right))<=1;
    }
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }
}