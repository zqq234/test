package com.bit.DataBase;

import com.bit.Man.LinkMan;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @className DataBaseOperation
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/1/6 23:54
 * @Version 1.0
 **/
public class DataBaseOperation {
    private final static String URL="jdbc:mysql://localhost/LinkMan_db";
    private final static String USER="root";
    private final static String PASSWORD="12345";

    public static DataSource getDataSource(){
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL(URL);
        dataSource.setUser(USER);
        dataSource.setPassword(PASSWORD);
        return dataSource;

    }
    //添加联系人信息
    public  static void addLinkMan(LinkMan man){

        Connection connection = null;
        PreparedStatement pstmt=null;

        try {
            connection=getDataSource().getConnection();
            String sql="insert into LinkMan values(?,?,?,?,?,?)";
            pstmt=connection.prepareStatement(sql);



            pstmt.setString(1,man.getName());
            pstmt.setString(2,man.getAddress());
            pstmt.setLong(3,man.getPhone());
            pstmt.setInt(4,man.getCode());
            pstmt.setString(5,man.getEmail());
            pstmt.setLong(6,man.getFamilyNumber());
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
    }
//修改联系人信息
    public  static void UpdateLinkMan(LinkMan man){

        Connection connection = null;
        PreparedStatement pstmt=null;

        try {
            connection=getDataSource().getConnection();
            String sql="update LinkMan set address=?,phone=?,code=?,Email=?,familNumber=? where name=?";
            pstmt=connection.prepareStatement(sql);


            pstmt.setString(1,man.getAddress());
            pstmt.setLong(2,man.getPhone());
            pstmt.setInt(3,man.getCode());
            pstmt.setString(4,man.getEmail());
            pstmt.setLong(5,man.getFamilyNumber());
            pstmt.setString(6,man.getName());
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
    }
    //查找联系人
    public static LinkMan FindLinkMan(String name){

        Connection connection = null;
        PreparedStatement pstmt=null;

        ResultSet rs=null;
        LinkMan man=new LinkMan();

        try {
            connection=getDataSource().getConnection();
            String sql="select *from LinkMan where name=?";
            pstmt=connection.prepareStatement(sql);

            System.out.println(pstmt);
            pstmt.setString(1,name);
            rs=pstmt.executeQuery();
            while(rs.next()){
                man.setName(rs.getString("name"));
                man.setAddress(rs.getString("address"));
                man.setPhone(rs.getLong("phone"));
                man.setCode(rs.getInt("code"));
                man.setEmail(rs.getString("Email"));
                man.setFamilyNumber(rs.getLong("familNumber"));
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
        return man;
    }
    //查询所有联系人信息
    public static void selectLinkMan(){

        Connection connection = null;
        PreparedStatement pstmt=null;

        ResultSet rs=null;
        LinkMan man=new LinkMan();
        try {
            connection=getDataSource().getConnection();
            String sql="select *from LinkMan";
            pstmt=connection.prepareStatement(sql);


            rs=pstmt.executeQuery();
            while(rs.next()){
                man.setName(rs.getString("name"));
                man.setAddress(rs.getString("address"));
                man.setPhone(rs.getLong("phone"));
                man.setCode(rs.getInt("code"));
                man.setEmail(rs.getString("Email"));
                man.setFamilyNumber(rs.getLong("familNumber"));
                System.out.println(man);
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
    }
    //排序
    public static void sortLinkMan(){
        Connection connection = null;
        PreparedStatement pstmt=null;
        LinkMan man=new LinkMan();
        ResultSet rs=null;
        int count=0;

        try {
            connection=getDataSource().getConnection();
            String sql="select * from LinkMan order by  phone";
            pstmt=connection.prepareStatement(sql);

            rs=pstmt.executeQuery();
            while(rs.next()){
                man.setName(rs.getString("name"));
                man.setAddress(rs.getString("address"));
                man.setPhone(rs.getLong("phone"));
                man.setCode(rs.getInt("code"));
                man.setEmail(rs.getString("Email"));
                man.setFamilyNumber(rs.getLong("familNumber"));
                //list.add(man);
                System.out.println(man);
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

    }
}
