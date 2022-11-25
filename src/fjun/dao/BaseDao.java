package fjun.dao;

import fjun.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author FJun
 * @ClassName BaseDao
 * @Description
 * @date 2022/8/30
 */
public abstract class BaseDao {
    private QueryRunner queryRunner = new QueryRunner();

    /**
     * 用来执行数据的增删改(update)
     *
     * @param conn
     * @param sql
     * @param args
     * @return
     */
    public int update(Connection conn, String sql, Object... args) {
        try {
            return queryRunner.update(conn, sql, args);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtils.closeResource(conn, null, null);
        }
    }

    /**
     * 用来查询并返回一条记录数据
     * @param type
     * @param conn
     * @param sql
     * @param args
     * @return
     * @param <T>
     */
    public <T> T queryForOne(Class<T> type, Connection conn,String sql,Object...args) {
        try {
            BeanHandler<T> beanHandler = new BeanHandler<>(type);
            return queryRunner.query(conn,sql,beanHandler,args);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtils.closeResource(conn,null,null);
        }
    }

    /**
     * 用来查询并返回多条记录的数据
     * @param type
     * @param conn
     * @param sql
     * @param args
     * @return
     * @param <T>
     */
    public <T> List<T> queryForList(Class<T> type, Connection conn, String sql, Object...args) {
        try {
            BeanListHandler<T> listHandler = new BeanListHandler<>(type);
            return queryRunner.query(conn,sql,listHandler,args);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtils.closeResource(conn,null,null);
        }
    }

    /**
     * 用于查询并返回特殊值
     * @param conn
     * @param sql
     * @param args
     * @return
     */
    public Object queryForValue(Connection conn,String sql,Object...args){
        try {
            ScalarHandler scalarHandler = new ScalarHandler();
            return queryRunner.query(conn,sql,scalarHandler,args);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtils.closeResource(conn,null,null);
        }
    }

}
