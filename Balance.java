import java.util.*;

/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}*/
public class Balance {
    public boolean isBalance(TreeNode root) {
        // write code here
        if(root==null){
            return true;
        }
        return isBalance(root.left)&&isBalance(root.right)&&Math.abs(height(root.left)-height(root.right))<2;
    }
    public int height(TreeNode root){
        if(root==null)
            return 0;
        else{
            return Math.max(height(root.right),height(root.left))+1;
        }
    }
}