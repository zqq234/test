class MirrorTree {
    public TreeNode mirrorTree(TreeNode root) {
        if(root!=null){
            TreeNode tmp=root.left;
            root.left=mirrorTree(root.right);
            root.right=mirrorTree(tmp);
        }
        return root;
    }
}