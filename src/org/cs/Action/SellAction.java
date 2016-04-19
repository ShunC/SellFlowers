package org.cs.Action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.cs.Model.SellFlowers;
import org.cs.Service.I_SellFlowersService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by pc on 2016/4/19.
 */
@Controller("sellAction")
@Scope("prototype")
public class SellAction extends ActionSupport implements ModelDriven<SellFlowers>{
    private SellFlowers sellFlowers;
    private I_SellFlowersService sellFlowersService;

    public I_SellFlowersService getSellFlowersService() {
        return sellFlowersService;
    }
    @Resource
    public void setSellFlowersService(I_SellFlowersService sellFlowersService) {
        this.sellFlowersService = sellFlowersService;
    }

    @Override
    public SellFlowers getModel() {
        if (sellFlowers == null) sellFlowers = new SellFlowers();
        return sellFlowers;
    }

    /*
    * 鲜花出售
    * */
    public String sell(){
        sellFlowersService.sell();
        return "sell";
    }

    /*
    * 获取鲜花信息
    * */
    public String load(){
        return "success";
    }

    /*
    * 获取一组鲜花信息
    * */
    public String list(){
        return "success";
    }

    /*
    * 删除鲜花信息
    * */
    public String delete(){
        return "success";
    }

    /*
    * 添加鲜花信息
    * */
    public String add(){
        return "success";
    }

    /*
    * 修改鲜花信息
    * */
    public String update(){
        return "success";
    }
}
