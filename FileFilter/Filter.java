package FileFilter;

import java.io.File;

/**
 * @className Filter
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/1/29 19:27
 * @Version 1.0
 **/
public class Filter {
    public static void main(String[] args) {
        File flie=new File("f:\\java");
        getAllFile(flie);
    }

    public static void getAllFile(File dir){
        File[] files=dir.listFiles(new FileFilterImpl());
        for(File f:files){
            if(f.isDirectory()){
                getAllFile(f);
            }else{
                System.out.println(f);
            }
        }
    }
}
