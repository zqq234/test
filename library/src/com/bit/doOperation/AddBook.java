package com.bit.doOperation;

import com.bit.Database.Mysql;
import com.bit.table.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @className AddBook
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/1/8 14:57
 * @Version 1.0
 **/
public class AddBook extends Mysql implements IOperation{//添加图书
    public void work() {
        System.out.println("添加书籍");
        System.out.println("请输入图书的名字：");
        String name=scanner.next();
        System.out.println("请输入图书的编号");
        int bno=scanner.nextInt();
        System.out.println("请输入图书的作者");
        String author=scanner.next();
        System.out.println("请输入图书的出版社");
        String publish=scanner.next();
        System.out.println("请输入图书的类型");
        String type=scanner.next();
        System.out.println("请输入图书的位置");
        String location=scanner.next();
        System.out.println("请输入同名图书的位置");
        String namelocation=scanner.next();
        Book book=new Book(name,bno,author,publish,type,location,namelocation);

        Connection connection = null;
        PreparedStatement pstmt=null;

        try{
            connection = getDataSource().getConnection();
            String sql = "insert into book values(?,?,?,?,?,?,?,?)";
            pstmt = connection.prepareStatement(sql);


            pstmt.setString(1, book.getName());
            pstmt.setInt(2, book.getBno());
            pstmt.setString(3, book.getAuthor());
            pstmt.setString(4, book.getPublish());
            pstmt.setString(5, book.getType());
            pstmt.setString(6, book.getLocation());
            pstmt.setString(7, book.getNameLocation());
            pstmt.setBoolean(8, book.isBorrowed());

            pstmt.execute();
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
        System.out.println("添加成功");
    }
}
