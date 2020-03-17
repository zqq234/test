import java.util.ArrayList;


/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
import java.util.*;
public class Print1 {
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        if(pRoot==null){
            return res;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(pRoot);
        while(!q.isEmpty()){
            ArrayList<Integer> list=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode tmp=q.poll();
                if(tmp==null){
                    continue;
                }
                list.add(tmp.val);
                q.add(tmp.left);
                q.add(tmp.right);
            }
            if(list.size()>=1){
                res.add(list);
            }
        }
        return res;
    }   
}