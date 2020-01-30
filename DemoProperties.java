package Properties;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
/**
 * @className DemoProperties
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/1/30 19:51
 * @Version 1.0
 **/
public class DemoProperties {
    public static void main(String[] args) throws IOException {
        Properties prop=new Properties();
        prop.setProperty("张三","143");
        prop.setProperty("李四","146");
        prop.setProperty("王五","173");
        prop.store(new FileWriter("d:"),"sava data");
    }
}
