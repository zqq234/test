/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BuildTree{ 
    int tmp=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
    
        return BinaryTree(preorder,inorder,0,inorder.length);
    }
    private TreeNode BinaryTree(int[] pre,int[] in,int left,int right){
        if(tmp>=pre.length||right<=left){
            return null;
        }
        TreeNode root=new TreeNode(pre[tmp]);
        int i=left;
        for(;i<right;i++){
            if(in[i]==pre[tmp]){
                break;
            }
        }
        tmp++;
        root.left=BinaryTree(pre,in,left,i);
        root.right=BinaryTree(pre,in,i+1,right);
        
        return root;
    }
}