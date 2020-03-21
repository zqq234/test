/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class WidthOfBinaryTree1 {
    Map<Integer,Integer> map=new HashMap<>();
    int res=0;
    public int widthOfBinaryTree(TreeNode root) {
        func(root,0,0);
        return res;
    }
    void func(TreeNode root,int height,int pos){
        if(root!=null){
            map.computeIfAbsent(height,value->pos);
            res=Math.max(res,pos-map.get(height)+1);
            func(root.left,height+1,pos*2);
            func(root.right,height+1,pos*2+1);
        }
    }
}