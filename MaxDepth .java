class MaxDepth {
    public int maxDepth(Node root) {
        if(root==null){
            return 0;
        }
        int x=0;
        for(Node node:root.children){
            x=Math.max(x,maxDepth(node));
        }
        return x+1;
    }
}