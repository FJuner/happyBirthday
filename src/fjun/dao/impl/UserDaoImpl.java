package fjun.dao.impl;

import fjun.dao.BaseDao;
import fjun.dao.UserDao;
import fjun.pojo.User;
import fjun.utils.JDBCUtils;

import java.sql.Connection;

/**
 * @author FJun
 * @ClassName UserDaoImpl
 * @Description
 * @date 2022/8/31
 */
public class UserDaoImpl extends BaseDao implements UserDao {


    @Override
    public User queryUserByUserName(String username) {
        try {
            Connection conn = JDBCUtils.getConnectionDruid();
            String sql = "select `id`,`username`,`password`,`email`from t_user where username = ?";
            return queryForOne(User.class,conn,sql,username);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public User queryUserByUserNameAndPassword(String username, String password) {
        try {
            Connection conn = JDBCUtils.getConnectionDruid();
            String sql = "select `id`,`username`,`password`,`email`from t_user where username = ? and password = ?";
            return queryForOne(User.class,conn,sql,username,password);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int saveUser(User user) {
        try {
            Connection conn = JDBCUtils.getConnectionDruid();
            String sql = "insert into t_user(`username`,`password`,`email`)value(?,?,?) ";
            return update(conn,sql,user.getUsername(),user.getPassword(),user.getEmail());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
