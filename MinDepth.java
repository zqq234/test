/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class MinDepth {
    public int minDepth(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        if(root!=null){
            q.offer(root);
        }
        int count=0;
        int flag=0;
        while(!q.isEmpty()){
            int size=q.size();
            count++;
            for(int i=0;i<size;i++){
              TreeNode tmp=q.poll();
               if(tmp.left==null&&tmp.right==null){
                    flag=1;
               }
                if(tmp.left!=null){
                    q.offer(tmp.left);
                }
                if(tmp.right!=null){
                    q.offer(tmp.right);
                }
            }
            if(flag==1){
                break;
            }
        }
        return count;
    }
}