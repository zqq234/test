package trycatch;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @className ExceptionPro
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/1/30 18:57
 * @Version 1.0
 **/
public class ExceptionPro {
    public static void main(String[] args) {
        FileWriter fw=null;
        try {
            fw=new FileWriter("d:\\g.txt",true);
            for(int i=0;i<10;i++){
                fw.write("hellow"+i+"\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
