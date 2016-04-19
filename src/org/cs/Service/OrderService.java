package org.cs.Service;

import org.cs.Dao.I_BuyFlowersDao;
import org.cs.Dao.I_FlowersDao;
import org.cs.Dao.I_SellFlowersDao;
import org.cs.Dao.I_UserDao;
import org.cs.Model.BuyFlowers;
import org.cs.Model.Flowers;
import org.cs.Model.SellFlowers;
import org.cs.Model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by pc on 2016/4/19.
 */
@Service("orderService")
public class OrderService implements I_OrderService {

    protected I_UserDao userDao;
    protected I_FlowersDao flowersDao;
    protected I_SellFlowersDao sellFlowersDao;
    protected I_BuyFlowersDao buyFlowersDao;

    public I_BuyFlowersDao getBuyFlowersDao() {
        return buyFlowersDao;
    }
    @Resource
    public void setBuyFlowersDao(I_BuyFlowersDao buyFlowersDao) {
        this.buyFlowersDao = buyFlowersDao;
    }

    public I_SellFlowersDao getSellFlowersDao() {
        return sellFlowersDao;
    }
    @Resource
    public void setSellFlowersDao(I_SellFlowersDao sellFlowersDao) {
        this.sellFlowersDao = sellFlowersDao;
    }

    public I_FlowersDao getFlowersDao() {
        return flowersDao;
    }
    @Resource
    public void setFlowersDao(I_FlowersDao flowersDao) {
        this.flowersDao = flowersDao;
    }

    public I_UserDao getUserDao() {
        return userDao;
    }
    @Resource
    public void setUserDao(I_UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void requestOrder() {

    }

    @Override
    public void newOrder() {

    }

    @Override
    public void cancelOrder() {

    }

    @Override
    public void updateOrder() {

    }
}
