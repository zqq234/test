package File.Upload;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @className TCPClient
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/2/4 13:53
 * @Version 1.0
 **/
public class TCPClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("c:\\1.jpg");
        Socket socket=new Socket("127.0.0.1",8080);
        OutputStream os=socket.getOutputStream();
        byte[] bytes=new byte[1024];
        int len=0;
        while((len=fis.read(bytes))!=-1){
            os.write(bytes,0,len);
        }
        socket.shutdownInput();
        InputStream is=socket.getInputStream();
        while((len=is.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        fis.close();
        socket.close();
    }
}
