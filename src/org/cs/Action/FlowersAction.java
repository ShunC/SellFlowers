package org.cs.Action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.cs.Model.Flowers;
import org.cs.Service.I_FlowersService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by pc on 2016/4/19.
 */
@Controller("flowersAction")
@Scope("prototype")
public class FlowersAction extends ActionSupport implements ModelDriven<Flowers>{
    private Flowers flowers;
    private I_FlowersService flowersService;

    public I_FlowersService getFlowersService() {
        return flowersService;
    }
    @Resource
    public void setFlowersService(I_FlowersService flowersService) {
        this.flowersService = flowersService;
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

    public String flowers(){
        return "success";
    }

    @Override
    public Flowers getModel() {
        if (flowers == null) flowers = new Flowers();
        return flowers;
    }
}
