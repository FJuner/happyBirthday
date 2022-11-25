package fjun.dao;

import fjun.pojo.User;

/**
 * @author FJun
 * @ClassName UserDao
 * @Description
 * @date 2022/8/31
 */
public interface UserDao {
    /**
     * 根据用户名查询用户信息(一般用来注册)
     * @param userName
     * @return
     */
    public User queryUserByUserName(String userName);

    /**
     * 根据用户名和密码查询用户信息(一般用来登录)
     * @param userName
     * @param password
     * @return
     */
    public User queryUserByUserNameAndPassword(String userName,String password);

    /**
     * 保存用户信息
     * @param user
     * @return
     */
    public int saveUser(User user);
}
