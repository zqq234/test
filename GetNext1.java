/*
public class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
*/
public class GetNext1 {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode.right!=null){
            TreeLinkNode tmp=pNode.right;
            while(tmp.left!=null){
                tmp=tmp.left;
            }
            return tmp;
        }
        if(pNode.next!=null&&pNode==pNode.next.left){
            return pNode.next;        
        }
        if(pNode.next!=null){
            TreeLinkNode tmp=pNode.next;
            while(tmp.next!=null&&tmp==tmp.next.right){
                tmp=tmp.next;
            }
            return tmp.next;
        }
        return null;
    }
}