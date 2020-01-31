import java.io.*;

/**
 * @className TransCode
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/1/31 13:50
 * @Version 1.0
 **/
public class TransCode {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(new FileInputStream("d:\\a.txt"),"gbk");
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("d:\\b.txt"));
        int len=0;
        while((len=isr.read())!=-1){
            osw.write(len);
        }
        osw.close();
        isr.close();
    }
}
