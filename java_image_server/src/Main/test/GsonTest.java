import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @className GsonTest
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/4/2 11:59
 * @Version 1.0
 **/
class Json{
    public String name;
    public String kill1;
    public String kill2;
}
public class GsonTest {
    public static void main(String[] args) {
        Json json=new Json();
        json.name="zhangsan";
        json.kill1="1";
        json.kill2="2";
        Gson gson=new GsonBuilder().create();
        String str=gson.toJson(json);
        System.out.println(str);
    }
}
