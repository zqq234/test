import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @className TreeNode
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/2/2 23:03
 * @Version 1.0
 **/
public class TreeNode {
    File file;
    long totalLength;//汇总该文件夹下所有文件大小
    List<TreeNode> children=new ArrayList<>();
}
