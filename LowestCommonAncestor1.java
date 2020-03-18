/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class LowestCommonAncestor1 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null||q==null||p==null){
            return null;
        }
        if(p==root||q==root){
            return root;
        }
        boolean ispleft=false;
        boolean ispright=false;
        boolean isqleft=false;
        boolean isqright=false;
        if(func(root.left,p)){
            ispleft=true;
        }else{
            ispright=true;
        }
        if(func(root.left,q)){
            isqleft=true;
        }else{
            isqright=true;
        }
        if(ispleft&&isqright||ispright&&isqleft){
            return root;
        }else if(ispleft&&isqleft){
            return lowestCommonAncestor(root.left,p,q);
        }else{
            return lowestCommonAncestor(root.right,p,q);
        }     
    }
    private boolean func(TreeNode root,TreeNode node){
        if(root==null){
            return false;
        }
        if(root==node){
            return true;
        }   
        if(func(root.left,node)||func(root.right,node)){
            return true;
        }
        return false;
    }
}