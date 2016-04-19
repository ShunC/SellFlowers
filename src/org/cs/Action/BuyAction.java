package org.cs.Action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.cs.Model.BuyFlowers;
import org.cs.Service.I_BuyFlowersService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by pc on 2016/4/19.
 */
@Controller("buyAction")
@Scope("prototype")
public class BuyAction extends ActionSupport implements ModelDriven<BuyFlowers>{

    private I_BuyFlowersService buyFlowersService;

    public I_BuyFlowersService getBuyFlowersService() {
        return buyFlowersService;
    }
    @Resource
    public void setBuyFlowersService(I_BuyFlowersService buyFlowersService) {
        this.buyFlowersService = buyFlowersService;
    }

    @Override
    public BuyFlowers getModel() {
        return null;
    }

    public String add(){
        return "success";
    }
    public String update(){
        return "success";
    }
    public String delete(){
        return "success";
    }
    public String load(){
        return "success";
    }
    public String list(){
        return "success";
    }

    public String buy(){
        buyFlowersService.buy();
        return "buy";
    }
}
