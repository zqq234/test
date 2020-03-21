/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class WidthOfBinaryTree {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        List<Integer> list=new LinkedList<>();
        list.add(0);
        int max=1;
        while(!q.isEmpty()){         
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode tmp=q.poll();
                int node=list.remove(0);
                if(tmp.left!=null){
                    q.offer(tmp.left);
                    list.add(node*2+1);
                }
                if(tmp.right!=null){
                    q.offer(tmp.right);
                    list.add(node*2+2);
                }
            }
            if(list.size()>=2){
                max=Math.max(max,list.get(list.size()-1)-list.get(0)+1);
            }
        }
        return max;
    }
}