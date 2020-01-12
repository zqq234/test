package com.bit.doOperation;

import com.bit.Database.Mysql;
import com.bit.table.Book;
import com.bit.table.Message;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @className Borrow
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/1/8 23:15
 * @Version 1.0
 **/
public class BorrowMessage extends Mysql implements IOperation {
    @Override
    public void work() {
        System.out.println("借阅书籍信息查询");
        System.out.println("请输入要查询借阅人的编号");
        int id=scanner.nextInt();
        Connection connection = null;
        PreparedStatement pstmt=null;

        ResultSet rs=null;
        Message m=new Message();
        try {
            connection=getDataSource().getConnection();
            String sql="select *from borrow,book where borrow.bno=book.bno and no=?";
            pstmt=connection.prepareStatement(sql);
            pstmt.setInt(1, id);
            rs=pstmt.executeQuery();
            while(rs.next()){
                m.setNo(rs.getInt("no"));
                m.setName(rs.getString("name"));
                m.setBno(rs.getInt("bno"));
                m.setBorrowTime(rs.getString("borrowTime"));
                m.setReturnTime(rs.getString("returnTime"));
                System.out.println(m);
            }

        } catch (SQLException e) {
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
    }
}
