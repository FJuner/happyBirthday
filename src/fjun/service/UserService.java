package fjun.service;

import fjun.pojo.User;

/**
 * @author FJun
 * @ClassName UserService
 * @Description
 * @date 2022/8/31
 */
public interface UserService {
    /**
     * 注册用户
     * @param user
     */
    public void registUser(User user);

    /**
     * 用户登录
     * @param user
     * @return
     */
    public User login(User user);

    /**
     * 检查用户名是否可用
     * @param username
     * @return true(用户名已存在):不可用；false:可用
     */
    public boolean existsUsername(String username);
}
