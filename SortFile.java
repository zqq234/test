import java.io.*;
import java.util.HashMap;

/**
 * @className SortFile
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/1/30 22:34
 * @Version 1.0
 **/
public class SortFile {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> map=new HashMap<>();
        BufferedReader br=new BufferedReader(new FileReader("d:\\a.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("e:\\a.txt"));
        String line;
        while((line=br.readLine())!=null){
            String[] arr=line.split("\\.");
            map.put(arr[0],arr[1]);
        }
        for(String str:map.keySet()){
            String value=map.get(str);
            line=str+"."+value;
            bw.write(line);
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
