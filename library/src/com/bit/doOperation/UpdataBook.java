package com.bit.doOperation;

import com.bit.Database.Mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @className UpdataBook
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/1/8 22:42
 * @Version 1.0
 **/
public class UpdataBook extends Mysql implements IOperation {
    @Override
    public void work() {
        System.out.println("修改书籍");
        System.out.println("请输入要修改书籍的编号");
        int bno=scanner.nextInt();
        Connection connection = null;
        PreparedStatement pstmt=null;

        try {
            connection=getDataSource().getConnection();
            String sql="update Book set name=?,author=?,publish=?,type=?,location=? ,nameLocation=? where bno=?";
            pstmt=connection.prepareStatement(sql);

            System.out.println("请输入要修改的书籍的名称：");
            String name=scanner.next();
            pstmt.setString(1,name);
            System.out.println("请输入要修改的书籍的作者：");
            String author=scanner.next();
            pstmt.setString(2,author);
            System.out.println("请输入要修改的书籍的出版社：");
            String publish=scanner.next();
            pstmt.setString(3,publish);
            System.out.println("请输入要修改的书籍的类型：");
            String type=scanner.next();
            pstmt.setString(4,type);
            System.out.println("请输入要修改的书籍的位置：");
            String location=scanner.next();
            pstmt.setString(5,location);
            System.out.println("请输入要修改的书籍的同名图书位置：");
            String nameLocation=scanner.next();
            pstmt.setString(6,nameLocation);
            pstmt.setInt(7,bno);
            pstmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null){
                    pstmt.close();
                }

                if (connection != null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        System.out.println("修改成功！");
    }
}
