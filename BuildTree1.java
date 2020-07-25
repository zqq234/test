class BuildTree{
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0||inorder.length==0){
            return null;
        }
        TreeNode head=new TreeNode(preorder[0]);
        int i=0;
        for(;i<inorder.length;i++){
            if(inorder[i]==preorder[0]){
                break;
            }
        }
        head.left=buildTree(Arrays.copyOfRange(preorder,1,i+1),Arrays.copyOfRange(inorder,0,i));
        head.right=buildTree(Arrays.copyOfRange(preorder,i+1,preorder.length),Arrays.copyOfRange(inorder,i+1,inorder.length));
        return head;
    }
}