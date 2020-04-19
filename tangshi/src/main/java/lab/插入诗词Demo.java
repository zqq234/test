package lab;

import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.*;

/**
 * @className 插入诗词Demo
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/2/12 15:06
 * @Version 1.0
 **/
public class 插入诗词Demo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String 朝代="唐代";
        String 作者="白居易";
        String 标题="问刘十九";
        String 正文="绿蚁新醅酒，红泥小火炉。晚来天欲雪，能饮一杯无？";
        //1.注册Driver
        //2.获取Connection通过DiverManager
        //Class.forName("com.mysql.jdbc.Driver");
        //String url="jdbc:mysql://127.0.0.1/tangshi?uesSSL=false&characterEncoding=utf8";
        //Connection connection=DriverManager.getConnection(url,"root","12345");
        //System.out.println(connection);
        //通过DataSource获取Connection
        //DataSource dataSource=new MysqlDataSource();
        //这个带有连接池，好处参照线程池
        DataSource dataSource=new MysqlConnectionPoolDataSource();
        ((MysqlConnectionPoolDataSource) dataSource).setServerName("127.0.0.1");
        ((MysqlConnectionPoolDataSource) dataSource).setPort(3306);
        ((MysqlConnectionPoolDataSource) dataSource).setUser("root");
        ((MysqlConnectionPoolDataSource) dataSource).setPassword("12345");
        ((MysqlConnectionPoolDataSource) dataSource).setDatabaseName("tangshi");
        ((MysqlConnectionPoolDataSource) dataSource).setUseSSL(false);
        ((MysqlConnectionPoolDataSource) dataSource).setCharacterEncoding("utf8");
        try (Connection connection=dataSource.getConnection();){
            String sql="insert into tangshi(sha256,dynasty,title,author,content,words) values (?,?,?,?,?,?)";
            PreparedStatement statement=connection.prepareStatement(sql);
            statement.setString(1,"sha256");
            statement.setString(2,"朝代");
            statement.setString(3,"标题");
            statement.setString(4,"作者");
            statement.setString(5,"正文");
            statement.setString(6,"");
            statement.executeUpdate();
        }
    }
}
