import java.util.*;
public class IsSymmetrical1{
    boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot==null){
            return true;
        }
        LinkedList<TreeNode> lnode=new LinkedList<>();
        LinkedList<TreeNode> rnode=new LinkedList<>();
        lnode.add(pRoot.left);
        rnode.add(pRoot.right);
        while(!lnode.isEmpty()&&!rnode.isEmpty()){
            TreeNode node1=lnode.poll();
            TreeNode node2=rnode.poll();
            if(node1==null&&node2==null){
                continue;
            }
            if(node1==null||node2==null){
                return false;
            }
            if(node1.val!=node2.val){
                return false;
            }
            lnode.add(node1.left);
            lnode.add(node1.right);
            rnode.add(node2.right);
            rnode.add(node2.left);
        }
        return lnode.isEmpty()&&rnode.isEmpty();
    }
}