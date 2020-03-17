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
public class Serialize {
    int index=-1;
    String Serialize(TreeNode root) {
        if(root==null){
            return "#";
        }else 
            return root.val+"!"+Serialize(root.left)+"!"+Serialize(root.right);
  }
    TreeNode Deserialize(String str) {
       String[] arr=str.split("!");
        ++index;
        if(index>=str.length()){
            return null;
        }
        TreeNode root=null;
        if(!arr[index].equals("#")){
            root=new TreeNode(Integer.parseInt(arr[index]));
            
            root.left=Deserialize(str);
            root.right=Deserialize(str);
        }
        return root;
  }
}