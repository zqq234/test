package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @className CopyDoc
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/1/30 15:50
 * @Version 1.0
 **/
public class CopyDoc {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("c:\\1.jpg");
        FileOutputStream fos=new FileOutputStream("d:\\1.jpg");
        int len=0;
        byte[] bytes=new byte[1024];
        while((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
    }
}
