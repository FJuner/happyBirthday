package fjun.test;

import fjun.utils.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;

/**
 * @author FJun
 * @ClassName JDBCUtilsTest
 * @Description
 * @date 2022/8/30
 */
public class JDBCUtilsTest {
    @Test
    public void testJdbcUtils(){
        for (int i = 0;i<100;i++){
            Connection connection = null;
            try {
                connection = JDBCUtils.getConnectionDruid();
                System.out.println(connection);
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                JDBCUtils.closeResource(connection,null,null);
            }
        }
    }
}
