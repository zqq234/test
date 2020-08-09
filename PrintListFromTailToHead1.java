import java.util.*;
public class ReConstructBinaryTree {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length==0||in.length==0){
            return null;
        }
        int val=pre[0];
        int i=0;
        for(;i<in.length;i++){
            if(in[i]==val){
                break;
            }
        }
        TreeNode head=new TreeNode(val);
        head.left=reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(in,0,i));
        head.right=reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(in,i+1,in.length));
        return head;
    }
}