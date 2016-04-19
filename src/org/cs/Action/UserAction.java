package org.cs.Action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.cs.Exception.UserException;
import org.cs.Model.User;
import org.cs.Service.I_UserService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by pc on 2016/4/19.
 */
@Controller("userAction")
@Scope("prototype")
public class UserAction extends ActionSupport implements ModelDriven<User>{
    private User user;
    private I_UserService userService;

    public I_UserService getUserService() {
        return userService;
    }
    @Resource
    public void setUserService(I_UserService userService) {
        this.userService = userService;
    }

    @Override
    public User getModel() {
        if (user == null) user = new User();
        return user;
    }

    /*
    * 用户登录
    * */
    public String login(){
        userService.login();
        return "login";
    }

    /*
    * 用户注销
    * */
    public String logout(){
        userService.logout();
        return "logout";
    }

    /*
    * 异常处理
    * */
    public String userException(){
        return "userException";
    }

    /*
    * 权限
    * */
    public String power(){
        userService.power();
        return "power";
    }

    /*
    * 用户注册
    * */
    public String reg(){
        userService.reg();
        return "reg";
    }

}
