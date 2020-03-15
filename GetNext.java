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
import java.util.*;
public class GetNext {
    List<TreeLinkNode> res=new ArrayList<>();
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        TreeLinkNode cur=pNode;
        while(cur.next!=null){
            cur=cur.next;
        }
        inOrder(cur);
        for(int i=0;i<res.size();i++){
            if(res.get(i)==pNode){
                return i==res.size()-1?null:res.get(i+1);
            }
        }
        return null;
    }
    private void inOrder(TreeLinkNode root){
        if(root!=null){
            inOrder(root.left);
            res.add(root);
            inOrder(root.right);
        }
    }
}