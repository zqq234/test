package tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @className TcpClient
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/2/4 13:01
 * @Version 1.0
 **/
public class TcpClient {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("127.0.0.1",8888);
        OutputStream os=socket.getOutputStream();
        os.write("你好服务器".getBytes());
        InputStream is=socket.getInputStream();
        byte[] bytes=new byte[1024];
        int len=is.read(bytes);
        System.out.println(new String(bytes,0,len));
        socket.close();
    }
}
