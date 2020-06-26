class BalanceBST {
    List<Integer> list=new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        print(root);
        return build(0,list.size()-1);
    }
    public TreeNode build(int start,int end){
        if(start>end){
            return null;
        }
        int mid=start+((end-start)>>1);
        TreeNode node=new TreeNode(list.get(mid));
        node.left=build(start,mid-1);
        node.right=build(mid+1,end);
        return node;
    }
    public void print(TreeNode root){
        if(root!=null){
            print(root.left);
            list.add(root.val);
            print(root.right);
        }
    }
}
