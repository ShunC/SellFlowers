package org.cs.Model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by pc on 2016/4/19.
 */
@Entity
@Table(name = "tbl_user")
public class User {

    /*
    * 主键
    * */
    private String id;
    /*
    * 用户名
    * */
    private String userName;
    /*
    * 用户密码
    * */
    private String password;
    /*
    * 用户昵称
    * */
    private String nickName;
    /*
    * 用户权限
    * */
    private String power;
    /*
    * 用户购买信息
    * */
    private Set<BuyFlowers> buyFlowerses;

    public User() {
    }

    @Id
    @GeneratedValue(generator = "paymentableGenerator")
    @GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }
    @OneToMany(mappedBy = "bid")
    public Set<BuyFlowers> getBuyFlowerses() {
        return buyFlowerses;
    }

    public void setBuyFlowerses(Set<BuyFlowers> buyFlowerses) {
        this.buyFlowerses = buyFlowerses;
    }
}
