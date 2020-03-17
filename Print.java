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
public class Print {
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(pRoot==null){
            return res;
        }
        q.offer(pRoot);
        boolean flag=true;
        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode tmp=q.poll();
                if(tmp==null){
                    continue;
                }
                if(flag){
                    list.add(tmp.val);
                }else{
                    list.add(0,tmp.val);
                }
                q.offer(tmp.left);
                q.offer(tmp.right);
                
            }
            if(list.size()>0){
                    res.add(list);
            }
            flag=!flag;
        }
        return res;
    }
}