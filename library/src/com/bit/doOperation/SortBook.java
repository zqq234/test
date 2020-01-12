package com.bit.doOperation;

import com.bit.Database.Mysql;
import com.bit.table.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @className SortBook
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/1/8 23:41
 * @Version 1.0
 **/
public class SortBook extends Mysql implements IOperation {
    @Override
    public void work() {
        Connection connection = null;
        PreparedStatement pstmt=null;
        Book book=new Book();
        ResultSet rs=null;
        int count=0;

        try {
            connection=getDataSource().getConnection();
            String sql="select * from book order by  bno desc";
            pstmt=connection.prepareStatement(sql);
            rs=pstmt.executeQuery();
            while(rs.next()){
                book.setName(rs.getString("name"));
                book.setBno(rs.getInt("bno"));
                book.setAuthor(rs.getString("author"));
                book.setPublish(rs.getString("publish"));
                book.setType(rs.getString("type"));
                book.setLocation(rs.getString("location"));
                book.setNameLocation(rs.getString("nameLocation"));
                book.setBorrowed(rs.getBoolean("isBorrowed"));
                System.out.println(book);
            }

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
        System.out.println("排序成功！");
    }
}
