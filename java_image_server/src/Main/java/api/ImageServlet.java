package api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dao.Image;
import dao.ImageDao;
import javafx.scene.input.DataFormat;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @className ImageServlet
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/4/5 22:23
 * @Version 1.0
 **/
@WebServlet("/image")
public class ImageServlet extends HttpServlet {


     @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.获取图片的属性信息，并且存入数据库
        // a）需要创建一个factory对象和upload对象
        FileItemFactory factory=new DiskFileItemFactory();
        ServletFileUpload upload=new ServletFileUpload(factory);
            //b)通过upload对象进一步解析
        //FileItem代表一个上传的文件对象
        List<FileItem> items;
        try {
            items=upload.parseRequest(req);
        } catch (FileUploadException e) {
            //出现异常说明解析出错！
            e.printStackTrace();
            //告诉客户端出现的具体的错误
            resp.setContentType("application/json;charset=utf-8");
            resp.getWriter().write("{\"ok\":false,\"reason\":\"请求解析失败\"}");
            return;
        }
        //c)把FileItem中的属性提取出来，转换成Image对象，才能存到数据库中
        FileItem fileItem=items.get(0);
        Image image=new Image();
        image.setImageName(fileItem.getName());
        image.setSize((int)fileItem.getSize());
        SimpleDateFormat format=new SimpleDateFormat("yyyyMMdd");
        image.setUploadTime(format.format(new Date()));
        image.setContentType(fileItem.getContentType());

        image.setMad5(DigestUtils.md5Hex(fileItem.get()));
        image.setPath("./image/"+image.getMad5());
        //存到数据库中
        ImageDao imageDao=new ImageDao();

        Image existImage=imageDao.selectMd5(image.getMad5());
         imageDao.insert(image);

        //2.获取图片的内容信息，并且存入磁盘文件
         if(existImage==null){
             File file=new File(image.getPath());
             try {
                 fileItem.write(file);
             } catch (Exception e) {
                 e.printStackTrace();
                 resp.setContentType("application/json;charset=utf-8");
                 resp.getWriter().write("{\"ok\":false,\"reason\":\"存磁盘操作失败\"}");
                 return;
             }
         }
        //3.给客户端返回一个结果数据
         /*resp.setContentType("application/json;charset=utf-8");
        resp.getWriter().write("{\"ok\":true}");*/
         resp.sendRedirect("lw-img.html");

    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json;charset=utf-8");
        String imageId=req.getParameter("imageId");
        if(imageId==null||imageId.equals("")){
            resp.setStatus(200);
            resp.getWriter().write("{\"ok\":false,\"reason\":\"请求解析失败\"}");
            return;
        }
        ImageDao imageDao=new ImageDao();
        Image image=imageDao.selectOne(Integer.parseInt(imageId));
        if(image==null){
            resp.setStatus(200);
            resp.getWriter().write("{\"ok\":false,\"reason\":\"在数据库中不存在\"}");
            return;
        }
        imageDao.delete(Integer.parseInt(imageId));
        Image existImage=imageDao.selectMd5(image.getMad5());
        if(existImage==null){
            File file=new File(image.getPath());
            file.delete();
            resp.setStatus(200);
            resp.getWriter().write("{\"ok\":true}");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String imageId=req.getParameter("imageId");
        if(imageId==null||imageId.equals("")){
            selectAll(req,resp);
        }else{
            selectOne(imageId,resp);
        }
    }

    private void selectOne(String imageId, HttpServletResponse resp) throws IOException {
        resp.setContentType("application/json;charset=utf-8");
        ImageDao imageDao=new ImageDao();
        Image image=imageDao.selectOne(Integer.parseInt(imageId));
        Gson gson=new GsonBuilder().create();
        String jsonData=gson.toJson(image);
        resp.getWriter().write(jsonData);
    }

    private void selectAll(HttpServletRequest req,HttpServletResponse resp) throws IOException {
         resp.setContentType("application/json;charset=utf-8");
         ImageDao imageDao=new ImageDao();
         List<Image> images=imageDao.selectAll();
         Gson gson=new GsonBuilder().create();
         String jsonData=gson.toJson(images);
         resp.getWriter().write(jsonData);
    }
}
