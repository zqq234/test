package dao;

import com.JavaImageServerException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.prefs.PreferenceChangeEvent;

/**
 * @className ImageDao
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/4/4 20:00
 * @Version 1.0
 **/
public class ImageDao {
    public void insert(Image image){
        //1.获取数据库连接
        Connection connection=DBUtil.getConnection();
        //2.创建并拼接SQL语句
        String sql="insert into image_table values(null,?,?,?,?,?,?)";
        PreparedStatement statement=null;
        try {
            statement=connection.prepareStatement(sql);
            statement.setString(1,image.getImageName());
            statement.setInt(2,image.getSize());
            statement.setString(3,image.getUploadTime());
            statement.setString(4,image.getContentType());
            statement.setString(5,image.getPath());
            statement.setString(6,image.getMad5());

            //3.执行SQL语句
            int ret=statement.executeUpdate();
            if(ret!=1){
                //程序出现问题，抛出一个异常
                throw new JavaImageServerException("插入数据库出错！");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }catch (JavaImageServerException e) {
            e.printStackTrace();
        }finally {
            //4.关闭连接和statement对象
            DBUtil.close(connection,statement,null);
        }


    }
    //查找数据库中的所有图片的信息
    public List<Image> selectAll(){
        List<Image> images=new ArrayList<Image>();
        Connection connection=DBUtil.getConnection();
        String sql="select * from image_table";
        PreparedStatement statement=null;
        ResultSet resultSet=null;
        try {
            statement=connection.prepareStatement(sql);
            resultSet=statement.executeQuery();
            while(resultSet.next()){
                Image image=new Image();
                image.setImageId(resultSet.getInt("imageId"));
                image.setImageName(resultSet.getString("imageName"));
                image.setSize(resultSet.getInt("size"));
                image.setUploadTime(resultSet.getString("uploadTime"));
                image.setPath(resultSet.getString("path"));
                image.setMad5(resultSet.getString("md5"));
                image.setContentType(resultSet.getString("contentType"));
                images.add(image);
            }
            return images;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.close(connection,statement,resultSet);
        }
        return null;
    }
    //根据imageId查找指定的图片信息
    public Image selectOne(int imageId){
        Connection connection=DBUtil.getConnection();
        String sql="select * from image_table where imageId=?";
        PreparedStatement statement=null;
        ResultSet resultSet=null;
        try {
            statement=connection.prepareStatement(sql);
            statement.setInt(1,imageId);
            resultSet=statement.executeQuery();
            if(resultSet.next()){
                Image image=new Image();
                image.setImageId(resultSet.getInt("imageId"));
                image.setImageName(resultSet.getString("imageName"));
                image.setSize(resultSet.getInt("size"));
                image.setUploadTime(resultSet.getString("uploadTime"));
                image.setPath(resultSet.getString("path"));
                image.setMad5(resultSet.getString("md5"));
                image.setContentType(resultSet.getString("contentType"));
                return image;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.close(connection,statement,resultSet);
        }
        return null;
    }
    public void delete(int imageId){
        Connection connection=DBUtil.getConnection();
        String sql="delete from image_table where imageId=?";
        PreparedStatement statement=null;
        try {
            statement=connection.prepareStatement(sql);
            statement.setInt(1,imageId);
            int ret=statement.executeUpdate();
            if(ret!=1){
                throw new JavaImageServerException("删除数据库操作失败");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }catch (JavaImageServerException e) {
            e.printStackTrace();
        }finally {
            //4.关闭连接和statement对象
            DBUtil.close(connection,statement,null);
        }
    }

    public static void main(String[] args) {
/*        Image image=new Image();
        image.setImageName("2.png");
        image.setSize(100);
        image.setPath("./data/1.png");
        image.setUploadTime("20200404");
        image.setContentType("image/png");
        image.setMad5("1122343");
        ImageDao imageDao=new ImageDao();
        imageDao.insert(image);
       ImageDao imageDao=new ImageDao();
        Image image=imageDao.selectOne(1);
        System.out.println(image);*/
        List<Image> images=new ArrayList<>();
        ImageDao imageDao=new ImageDao();
        images=imageDao.selectAll();
        System.out.println(images);
    }
    public Image selectMd5(String md5){
        Connection connection=DBUtil.getConnection();
        String sql="select * from image_table where md5=?";
        PreparedStatement statement=null;
        ResultSet resultSet=null;
        try {
            statement=connection.prepareStatement(sql);
            statement.setString(1,md5);
            resultSet=statement.executeQuery();
            if(resultSet.next()){
                Image image=new Image();
                image.setImageId(resultSet.getInt("imageId"));
                image.setImageName(resultSet.getString("imageName"));
                image.setSize(resultSet.getInt("size"));
                image.setUploadTime(resultSet.getString("uploadTime"));
                image.setPath(resultSet.getString("path"));
                image.setMad5(resultSet.getString("md5"));
                image.setContentType(resultSet.getString("contentType"));
                return image;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.close(connection,statement,resultSet);
        }
        return null;
    }
}
