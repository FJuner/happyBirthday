package fjun.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author FJun
 * @ClassName JDBCUtils
 * @Description
 * @date 2022/8/30
 */
public class JDBCUtils {
    private static DataSource dataSource;
    static {
        try {
            Properties properties = new Properties();
//            InputStream inputStream = ClassLoader.getSystemClassLoader().getResourceAsStream("resources/jdbc.properties");
            InputStream inputStream = JDBCUtils.class.getClassLoader().getResourceAsStream("resources/jdbc.properties");
            properties.load(inputStream);
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * 获取连接
     * @return
     * @throws Exception
     */
    public static Connection getConnectionDruid() throws Exception {
        Connection connection = dataSource.getConnection();
        return connection;
    }


    /**
     * 关闭资源
     * @param connection
     * @param preparedStatement
     * @param resultSet
     */
    public static void closeResource(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet) {

        try {
            if (preparedStatement != null)
                preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            if (connection != null)
                connection.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            if (resultSet != null)
                resultSet.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
