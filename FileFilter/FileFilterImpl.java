package FileFilter;

import java.io.File;
import java.io.FileFilter;

/**
 * @className FileFilterImpl
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/1/29 19:28
 * @Version 1.0
 **/
public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if(pathname.isDirectory()){
            return true;
        }
        return pathname.getName().toLowerCase().endsWith(".java");
    }
}
