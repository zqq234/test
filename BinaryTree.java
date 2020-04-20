/**
 * @className BinaryTree
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/4/20 10:06
 * @Version 1.0
 **/
class Tree{
    public int val;
    public Tree left;
    public Tree right;
    public Tree(int val){
        this.val=val;
    }
}
public class BinaryTree {
    private Tree root;
    public void insert(int val){
        Tree newNode=new Tree(val);

        if(root==null){
            root=newNode;
        }else{
            Tree cur=root;
            Tree parent=cur;
            while(true){
                parent=cur;
                if(cur.val<val){
                    cur=cur.right;
                    if(cur==null){
                        parent.right=newNode;
                        return;
                    }
                }else{
                    cur=cur.left;
                    if(cur==null){
                        parent.left=newNode;
                        return;
                    }
                }
            }
        }
    }
    public void print(Tree root){
        if(root!=null){
            print(root.left);
            System.out.println(root.val);
            print(root.right);
        }
    }
    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        tree.insert(3);
        tree.insert(1);
        tree.insert(8);
        tree.insert(2);
        tree.print(tree.root);
    }
}
