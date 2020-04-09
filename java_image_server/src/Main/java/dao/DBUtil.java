package dao;

//import com.mysql.jdbc.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;

/**
 * @className DBUtil
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/4/4 17:01
 * @Version 1.0
 **/
public class DBUtil {
    private static final String URL="jdbc:mysql://localhost:3306/java_image_server?characterEncoding=utf8&&useSSL=true";
    private static final String USERNAME="root";
    private static final String PASSWORD="12345";

    private static volatile DataSource dataSource=null;

    public static DataSource getDataSource(){
        if(dataSource==null){
            synchronized (DBUtil.class){
                if(dataSource==null){
                    dataSource=new MysqlDataSource();
                    MysqlDataSource tmpDataSource=(MysqlDataSource)dataSource;
                    tmpDataSource.setURL(URL);
                    tmpDataSource.setUser(USERNAME);
                    tmpDataSource.setPassword(PASSWORD);
                }
            }
        }
        return dataSource;
    }
    public static Connection getConnection()  {
        try {
            return getDataSource().getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void close(Connection connection, PreparedStatement statement, ResultSet resultSet)  {
        try {
            if(resultSet!=null){
                resultSet.close();
            }
            if(statement!=null){
                statement.close();
            }
            if(connection!=null){
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
