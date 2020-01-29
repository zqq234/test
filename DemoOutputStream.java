package IO;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @className DemoOutputStream
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/1/29 21:07
 * @Version 1.0
 **/
public class DemoOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("E:\\java\\File和IO\\a.txt");
        fos.write(97);
        fos.close();
    }
}
