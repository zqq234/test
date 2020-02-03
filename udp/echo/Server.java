package udp.echo;

import java.io.IOException;
import java.net.*;

/**
 * @className Server
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/2/3 19:42
 * @Version 1.0
 **/
public class Server {
    public static void main(String[] args) throws IOException {
        //1.新建一个DatagramSocket
        DatagramSocket udpServerSocket=new DatagramSocket(9898);
        while(true){
            byte[] receiveBuffer=new byte[1024];
            DatagramPacket receiPacket=new DatagramPacket(receiveBuffer,receiveBuffer.length);
            udpServerSocket.receive(receiPacket);
            InetAddress clientAddress=receiPacket.getAddress();
            System.out.printf("我从%s:%d收到了消息%n",clientAddress.getHostAddress(),receiPacket.getPort());
            System.out.printf("我一共收到了%d字节的数据%n",receiPacket.getLength());
            String message=new String(receiPacket.getData(),0,receiPacket.getLength(),"UTF-8");
            System.out.println(message);
        }
        //udpServerSocket.close();
    }
}
