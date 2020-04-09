package api;

import dao.Image;
import dao.ImageDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashSet;

/**
 * @className ImageShow
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/4/8 19:34
 * @Version 1.0
 **/
@WebServlet("/imageShow")
public class ImageShow extends HttpServlet {
    static private HashSet<String> whiteList=new HashSet<>();
    static{
        whiteList.add("http://123.56.44.201:8080/java_image_server/lw-img.html");
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String referer=req.getHeader("Referer");
        if(!whiteList.contains(referer)){
            resp.setContentType("application/json;charset:utf-8");
            resp.getWriter().write("{\"ok\":false,\"reason\":\"未授权的访问\"}");
        }
        String imageId=req.getParameter("imageId");
        if(imageId==null||imageId.equals("")){
            resp.setContentType("application/json;charset:utf-8");
            resp.getWriter().write("{\"ok\":false,\"reason\":\"imageId解析失败\"}");
            return;
        }
        ImageDao imageDao=new ImageDao();
        Image image =imageDao.selectOne(Integer.parseInt(imageId));
        resp.setContentType(image.getContentType());
        File file=new File(image.getPath());
        //由于图片是二进制文件，应使用字节流的方式读取文件
        OutputStream outputStream=resp.getOutputStream();
        FileInputStream fileInputStream=new FileInputStream(file);
        byte[] buffer=new byte[1024];
        while (true){
            int len=fileInputStream.read(buffer);
            if(len==-1){
                break;
            }
            outputStream.write(buffer);
        }
        fileInputStream.close();
        outputStream.close();
    }
}
