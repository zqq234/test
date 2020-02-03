package tcp.http;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @className Server
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/2/3 21:04
 * @Version 1.0
 **/
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket tcp=new ServerSocket(8080);
        while(true){
            Socket clientSocket=tcp.accept();
            InetAddress clientAddress=clientSocket.getInetAddress();
            int clientPort=clientSocket.getPort();
            System.out.printf("有客户端连接上来%s:%d%n",clientAddress.getHostAddress(),clientPort);
            InputStream is=clientSocket.getInputStream();
            InputStreamReader isReader=new InputStreamReader(is,"utf-8");
            BufferedReader reader=new BufferedReader(isReader);

            OutputStream os=clientSocket.getOutputStream();
            PrintStream out=new PrintStream(os,true,"utf-8");
            String line;
            while((line=reader.readLine())!=null){
                System.out.println(line);
                System.out.println("我已经收到了你的消息，退朝吧");
            }
        }
    }
}
