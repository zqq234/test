package File.Upload;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/**
 * @className TCPServer
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/2/4 14:13
 * @Version 1.0
 **/
public class TCPServer {
    public static void main(String[] args) throws IOException{
        ServerSocket server=new ServerSocket(8888);
        while(true){
            new Thread(new Runnable(){
                @Override
                public void run() {
                    try{
                        Socket socket=server.accept();
                        InputStream is=socket.getInputStream();
                        File file=new File("d:\\upload");
                        if(!file.exists()){
                            file.mkdirs();
                        }
        /*
        自定义一个文件的命名规则：防止同名文件被覆盖
        规则：域名+毫秒值+随机数
        */
                        String fileName="itcast"+System.currentTimeMillis()+new Random().nextInt(999999)+".jpg";
                        FileOutputStream fos=new FileOutputStream(file+"\\"+fileName);
                        int len=0;
                        byte[] bytes=new byte[1024];
                        while((len=is.read(bytes))!=-1){
                            fos.write(bytes,0,len);
                        }
                        socket.getOutputStream().write("上传成功".getBytes());
                        fos.close();
                        socket.close();
                    }catch(IOException e){
                        System.out.println(e);
                    }
                }
            }).start();
        }
    }
}
