/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BSTIterator {
    Stack<TreeNode> s=new Stack<>();
    public void print(TreeNode root){
        if(root!=null){
            print(root.right);
            s.push(root);
            print(root.left);
        }
    }
    public BSTIterator(TreeNode root) {
        print(root);
    }
    
    /** @return the next smallest number */
    public int next() {
        return s.pop().val;
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !s.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */