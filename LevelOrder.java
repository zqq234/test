/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class LevelOrder {
    public int[] levelOrder(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if(root==null){
            return new int[0];
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode tmp=q.poll();
                if(tmp==null){
                    continue;
                }
                res.add(tmp.val);
                q.offer(tmp.left);
                q.offer(tmp.right);
            }
        }
        int size=res.size();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=res.get(i);
        }
        return arr;
    }
}