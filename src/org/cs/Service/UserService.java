package org.cs.Service;

import org.cs.Dao.I_UserDao;
import org.cs.Exception.UserException;
import org.cs.Model.User;
import org.hibernate.Session;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by pc on 2016/4/19.
 */
@Service("userService")
public class UserService extends BaseService<User> implements I_UserService {

    private I_UserDao userDao;

    public I_UserDao getUserDao() {
        return userDao;
    }
    @Resource
    public void setUserDao(I_UserDao userDao) {
        this.userDao = userDao;
    }

    public UserService() {
        setBaseDao(userDao);
    }

    @Override
    public List<User> list() {
        String hql = "from User";
        return userDao.list(hql);
    }

    @Override
    public void login() {
        if (userDao == null ) throw new UserException("用户登录不能为空！");
    }

    @Override
    public void logout() {

    }

    @Override
    public void reg() {

    }

    @Override
    public void power() {

    }
}
