package com.bit.doOperation;

import com.bit.Database.Mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @className ReturnBook
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/1/8 23:39
 * @Version 1.0
 **/
public class ReturnBook extends Mysql implements IOperation {
    @Override
    public void work() {

        System.out.println("归还书籍");
        System.out.println("请输入要归还书籍的编号");
        int bno=scanner.nextInt();
        Connection connection = null;
        PreparedStatement pstmt=null;

        try {
            connection=getDataSource().getConnection();
            String sql="update Book set isBorrowed=false where bno=?";
            pstmt=connection.prepareStatement(sql);
            pstmt.setInt(1,bno);
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
        System.out.println("归还成功！");
    }
}
