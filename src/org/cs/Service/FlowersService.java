package org.cs.Service;

import org.cs.Dao.I_FlowersDao;
import org.cs.Model.Flowers;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by pc on 2016/4/19.
 */
@Service("flowersService")
public class FlowersService extends BaseService<Flowers> implements I_FlowersService {

    private I_FlowersDao flowersDao;

    public I_FlowersDao getFlowersDao() {
        return flowersDao;
    }
    @Resource
    public void setFlowersDao(I_FlowersDao flowersDao) {
        this.flowersDao = flowersDao;
    }

    public FlowersService() {
        setBaseDao(flowersDao);
    }

    @Override
    public List<Flowers> list() {
        String hql = "from Flowers";
        return flowersDao.list(hql);
    }
    @Override
    public void recommendFlowers(){

    }
}
