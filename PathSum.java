/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class PathSum {
    List<List<Integer>> res=new LinkedList<>();
    List<Integer> tmp=new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        func(root,sum);
        return res;
    }
    private void func(TreeNode root,int sum){
        if(root==null){
            return;
        }
        tmp.add(root.val);
        sum-=root.val;
        if(sum==0&&root.left==null&&root.right==null){
            res.add(new LinkedList<>(tmp));
        }
        func(root.left,sum);
        func(root.right,sum);
        tmp.remove(tmp.size()-1);
    }
}