package tcp.http;

import java.io.*;
import java.net.*;
import java.util.Scanner;

/**
 * @className Client
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/2/3 21:23
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        Socket tcp=new Socket();
        byte[] ipv4={127,0,0,1};
        InetAddress serverAddress=InetAddress.getByAddress(ipv4);
        SocketAddress severSocketAddress=new InetSocketAddress(serverAddress,8080);
        tcp.connect(severSocketAddress);

        while(true){
            System.out.println("请输出：");
            String request=sc.nextLine();
            OutputStream os=tcp.getOutputStream();
            PrintStream out=new PrintStream(os,true,"utf-8");
            out.println(request);
            out.flush();
            InputStream is=tcp.getInputStream();
            BufferedReader reader=new BufferedReader(new InputStreamReader(is,"utf-8"));
            String response=reader.readLine();
            System.out.println(response);
        }
    }
}
