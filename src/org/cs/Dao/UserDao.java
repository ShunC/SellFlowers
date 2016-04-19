package org.cs.Dao;

import org.cs.Model.User;
import org.springframework.stereotype.Repository;

/**
 * Created by pc on 2016/4/19.
 */
@Repository("userDao")
public class UserDao extends BaseDao<User> implements I_UserDao {
}
