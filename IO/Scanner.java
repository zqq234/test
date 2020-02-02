import java.io.File;

/**
 * @className Scanner
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/2/2 23:05
 * @Version 1.0
 **/
public class Scanner {
    public static void scannerDirectory(TreeNode node){
        File[] files=node.file.listFiles();
        if(files==null){
            return;
        }
        for(File file:files){
            TreeNode child=new TreeNode();
            child.file=file;
            if(file.isDirectory()){
                scannerDirectory(child);
            }else{
                child.totalLength=file.length();
            }
            node.children.add(child);
        }
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode();
        root.file=new File("F：\\videos");
        scannerDirectory(root);
        System.out.println("hello");
    }
}
