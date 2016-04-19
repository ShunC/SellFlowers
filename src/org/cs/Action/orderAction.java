package org.cs.Action;

import org.cs.Service.I_BuyFlowersService;
import org.cs.Service.I_OrderService;
import org.cs.Service.I_SellFlowersService;
import org.cs.Service.I_UserService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by pc on 2016/4/19.
 */
@Controller("orderAction")
@Scope("prototype")
public class orderAction {

    private I_OrderService orderService;

    public I_OrderService getOrderService() {
        return orderService;
    }
    @Resource
    public void setOrderService(I_OrderService orderService) {
        this.orderService = orderService;
    }

    /*
    * 请求订单
    * */
    public String requestOrder(){
        return "request";
    }

    /*
    * 创建订单
    * */
    public String newOrder(){
        return "newOrder";
    }

    /*
    * 取消订单
    * */
    public String cancelOrder(){
        return "cancel";
    }

    /*
    * 修改订单
    * */
    public String updateOrder(){
        return "updateOrder";
    }
}
