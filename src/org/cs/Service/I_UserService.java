package org.cs.Service;

import org.cs.Model.User;

/**
 * Created by pc on 2016/4/19.
 */
public interface I_UserService extends I_BaseService<User> {

    public void login();
    public void logout();
    public void reg();
    public void power();

}
