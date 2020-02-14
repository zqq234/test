/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class kthLargest {
    public int kthLargest(TreeNode root, int k) {
        List<Integer> list=new LinkedList();
        func(root,list);
        return list.get(list.size()-k);
    }
    public void func(TreeNode root,List list){
        if(root==null){
            return;
        }
        func(root.left,list);
        list.add(root.val);
        func(root.right,list);
    }
}
