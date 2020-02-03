package tcp.http;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.*;

/**
 * @className Server
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/2/3 21:04
 * @Version 1.0
 **/
public class Server {
    private static class TalkRunnable implements Runnable{
        private Socket clientSocket;
        TalkRunnable(Socket socket){
            this.clientSocket=socket;
        }

        @Override
        public void run(){
            try{
                InetAddress clientAddress=clientSocket.getInetAddress();
                int clientPort=clientSocket.getPort();
                System.out.printf("有客户端连接上来%s:%d%n",clientAddress.getHostAddress(),clientPort);
                InputStream is=clientSocket.getInputStream();
                InputStreamReader isReader=new InputStreamReader(is,"utf-8");
                BufferedReader reader=new BufferedReader(isReader);

                OutputStream os=clientSocket.getOutputStream();
                PrintStream out=new PrintStream(os,true,"utf-8");

                while(true){
                    String line=reader.readLine();
                    System.out.println("好友说："+line);
                    System.out.println("请回复》");
                    String response="我已经手打了"+System.currentTimeMillis();
                    out.println(response);
                    out.flush();
                }

            }catch (IOException e){
                e.printStackTrace();
            }

        }
    }
    public static void main(String[] args) throws IOException {
        ServerSocket tcp=new ServerSocket(8080);
        BlockingQueue<Runnable> queue=new LinkedBlockingDeque<>();
        ExecutorService pool=new ThreadPoolExecutor(100,100,0, TimeUnit.MILLISECONDS,queue);
        Scanner sc=new Scanner(System.in);
        while(true){
            Socket clientSocket=tcp.accept();
            pool.execute(new TalkRunnable(clientSocket));
        }
    }
}
