package com.bit.doOperation;

import com.bit.Database.Mysql;
import com.bit.table.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @className DelBook
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/1/8 15:30
 * @Version 1.0
 **/
public class DelBook extends Mysql implements IOperation {//删除图书
    @Override
    public void work() {
        System.out.println("删除书籍");
        System.out.println("请输入要删除图书的名字：");
        String name=scanner.next();

        Connection connection = null;
        PreparedStatement pstmt=null;

        try{
            connection = getDataSource().getConnection();
            String sql = "delete from book where name=?";
            pstmt = connection.prepareStatement(sql);


            pstmt.setString(1, name);
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
        System.out.println("删除成功");    }
}
