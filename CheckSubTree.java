/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class CheckSubTree{
    public boolean checkSubTree(TreeNode t1, TreeNode t2) {
        if(t1==null||t2==null){
            return false;
        }else{
            return recur(t1,t2)||checkSubTree(t1.left,t2)||checkSubTree(t1.right,t2);
        }
    }
    public boolean recur(TreeNode t1,TreeNode t2){
        if(t1==null&&t2==null){
            return true;
        }else if(t1==null||t2==null||t1.val!=t2.val){
            return false;
        }else{
            return recur(t1.left,t2.left)&&recur(t1.right,t2.right);
        }
    }
}