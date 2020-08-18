public class FindPath{
    ArrayList<ArrayList<Integer>> res=new ArrayList<>();
    ArrayList<Integer> tmp=new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        func(root,target);
        return res;
    }
    public void func(TreeNode root,int target){
        if(root==null)
            return;
        tmp.add(root.val);
        target-=root.val;
        func(root.left,target);
        func(root.right,target);
        if(target==0&&root.left==null&&root.right==null)
            res.add(new ArrayList(tmp));
        tmp.remove(tmp.size()-1);
    }
}