package lesson1;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Scanner;

/**
 * @className PrintWriterTest
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/4/5 16:51
 * @Version 1.0
 **/
public class PrintWriterTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    if(sc.nextInt()==0){
                        throw new RuntimeException("i===0");
                    }
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                    StringWriter sw=new StringWriter();
                    PrintWriter pw=new PrintWriter(sw);
                    e.printStackTrace(pw);
                    System.out.println(sw.toString());
                }

            }
        }).start();
    }
}
