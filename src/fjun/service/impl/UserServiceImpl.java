package fjun.service.impl;

import fjun.dao.UserDao;
import fjun.dao.impl.UserDaoImpl;
import fjun.pojo.User;
import fjun.service.UserService;

/**
 * @author FJun
 * @ClassName UserServiceImpl
 * @Description
 * @date 2022/8/31
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();
    @Override
    public void registUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public User login(User user) {
       return userDao.queryUserByUserNameAndPassword(user.getUsername(), user.getPassword());
    }

    @Override
    public boolean existsUsername(String username) {
        User userName = userDao.queryUserByUserName(username);
        if (userName == null){
            return false;
        }
        return true;
    }
}
