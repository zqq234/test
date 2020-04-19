import java.sql.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @className DBconfig
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/4/14 10:07
 * @Version 1.0
 **/
public class DBconfig {
    private static final String host="127.0.0.1";
    private static final int port=3306;
    private static final String user="root";
    private static final String password="12345";
    private static final String database="q";

    private static final DataSource dataSource;
    static {
        MysqlDataSource mysqlDataSource=new MysqlDataSource();
        mysqlDataSource.setServerName(host);
        mysqlDataSource.setPort(port);
        mysqlDataSource.setUser(user);
        mysqlDataSource.setPassword(password);
        mysqlDataSource.setUseSSL(false);
        mysqlDataSource.setCharacterEncoding("utf8");
        mysqlDataSource.setDatabaseName(database);
        dataSource=mysqlDataSource;
    }
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}
