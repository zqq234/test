package lab;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @className Java读取配置
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/2/12 21:17
 * @Version 1.0
 **/
public class Java读取配置 {
    public static void main(String[] args) throws IOException {
        InputStream is=Java读取配置.class.getClassLoader().getResourceAsStream("some.properties");
        Properties properties=new Properties();
        properties.load(is);
        String v=properties.getProperty("mysql.host");
        System.out.println(v);
    }


}
