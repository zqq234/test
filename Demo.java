package demo1;

import java.io.File;

/**
 * @className Demo
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/1/29 18:23
 * @Version 1.0
 **/
public class Demo {
    public static void main(String[] args) {
        File flie=new File("f:\\java");
        getAllFile(flie);
    }

    public static void getAllFile(File dir){
        System.out.println(dir);
        File[] files=dir.listFiles();
        for(File f:files){
            if(f.isDirectory()){
                getAllFile(f);
            }else{
                System.out.println(f);
            }
        }
    }
}

