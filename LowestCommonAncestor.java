/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null||q==null||p==null){
            return null;
        }
        Stack<TreeNode> s1=new Stack<>();
        Stack<TreeNode> s2=new Stack<>();
        func(root,p,s1);
        func(root,q,s2);
        int size1=s1.size();
        int size2=s2.size();
        while(size1>0&&size2>0){
            if(size1>size2){
                s1.pop();
                size1--;
            }else if(size1<size2){
                s2.pop();
                size2--;
            }else{
                if(s1.peek()==s2.peek()){
                    return s1.peek();
                }else{
                    s1.pop();
                    s2.pop();
                    size1--;
                    size2--;
                }
            }
        }
        return null; 
    }
    private boolean func(TreeNode root,TreeNode node,Stack<TreeNode> s){
        if(root==null){
            return false;
        }
        s.push(root);
        if(root==node){
            return true;
        }
        
        if(func(root.left,node,s)||func(root.right,node,s)){
            return true;
        }
        s.pop();
        return false;
    }
}