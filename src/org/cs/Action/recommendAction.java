package org.cs.Action;

import org.cs.Service.I_FlowersService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by pc on 2016/4/19.
 */
@Controller("recommendAction")
@Scope("prototype")
public class recommendAction {
    private I_FlowersService flowersService;

    public I_FlowersService getFlowersService() {
        return flowersService;
    }
    @Resource
    public void setFlowersService(I_FlowersService flowersService) {
        this.flowersService = flowersService;
    }

    public String recommendFlowers(){
        flowersService.recommendFlowers();
        return "recommend";
    }
}
