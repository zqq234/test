public class GetNext {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode.right!=null){
            TreeLinkNode node=pNode.right;
            while(node.left!=null){
                node=node.left;
            }
            return node;
        }else if(pNode.next!=null){
            TreeLinkNode node=pNode.next;
            TreeLinkNode cur=pNode;
            if(node.right==pNode){
                while(node!=null&&node.right==cur){
                    cur=node;
                    node=node.next;
                }
                return node;
            }else{
                return pNode.next;
            }
        }else{
            return null;
        }
    }
}