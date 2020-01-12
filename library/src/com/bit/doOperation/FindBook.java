package com.bit.doOperation;

import com.bit.Database.Mysql;
import com.bit.table.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @className FindBook
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/1/8 15:34
 * @Version 1.0
 **/
public class FindBook extends Mysql implements IOperation{//查找图书
    @Override
    public void work() {
        System.out.println("查找书籍");
        System.out.println("请输入要查找图书的编号：");
        int bno=scanner.nextInt();
        Book book=new Book();
        Connection connection = null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        try{
            connection = getDataSource().getConnection();
            String sql = "select *from book where bno=?";
            pstmt = connection.prepareStatement(sql);

            pstmt.setInt(1, bno);
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
            }
        } catch(SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }

                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(book!=null){
            System.out.println(book);
            System.out.println("查找成功");
        }else
            System.out.println("没有此书籍");

    }
}
