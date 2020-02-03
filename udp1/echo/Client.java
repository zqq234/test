package udp.echo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;


/**
 * @className Client
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/2/3 20:04
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) throws IOException {
        DatagramSocket udpClientSocket=new DatagramSocket();
        Scanner scanner=new Scanner(System.in);
        while (true){
            String message=scanner.nextLine();
            byte[] sendBuffer=message.getBytes("UTF-8");
            byte[] serverIP=new byte[4];
            serverIP[0]=127;
            serverIP[1]=0;
            serverIP[2]=0;
            serverIP[3]=1;
            InetAddress serverAddress=InetAddress.getByAddress(serverIP);
            DatagramPacket sendPacket=new DatagramPacket(sendBuffer,sendBuffer.length,serverAddress,9898);
            udpClientSocket.send(sendPacket);
            byte[] recerveBuffer=new byte[1024];
            DatagramPacket receivePacket=new DatagramPacket(recerveBuffer,recerveBuffer.length);
            udpClientSocket.receive(receivePacket);
            String responseMessage=new String(receivePacket.getData(),0,receivePacket.getLength(),"utf-8");
            System.out.println(responseMessage);
        }
        //udpClientSocket.close();
    }
}
