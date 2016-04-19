package org.cs.Service;

import org.cs.Dao.I_SellFlowersDao;
import org.cs.Model.SellFlowers;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by pc on 2016/4/19.
 */
@Service("sellFlowersService")
public class SellFlowersService extends BaseService<SellFlowers> implements I_SellFlowersService {

    private I_SellFlowersDao sellFlowersDao;

    public I_SellFlowersDao getSellFlowersDao() {
        return sellFlowersDao;
    }
    @Resource
    public void setSellFlowersDao(I_SellFlowersDao sellFlowersDao) {
        this.sellFlowersDao = sellFlowersDao;
    }

    public SellFlowersService() {
        setBaseDao(sellFlowersDao);
    }

    @Override
    public List<SellFlowers> list() {
        String hql = "from SellFlowers";
        return sellFlowersDao.list(hql);
    }
    @Override
    public void sell(){

    }
}
