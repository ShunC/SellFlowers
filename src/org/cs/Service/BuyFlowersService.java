package org.cs.Service;

import org.cs.Dao.I_BuyFlowersDao;
import org.cs.Model.BuyFlowers;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by pc on 2016/4/19.
 */
@Service("buyFlowersService")
public class BuyFlowersService extends BaseService<BuyFlowers> implements I_BuyFlowersService {

    private I_BuyFlowersDao buyFlowersDao;

    public I_BuyFlowersDao getBuyFlowersDao() {
        return buyFlowersDao;
    }
    @Resource
    public void setBuyFlowersDao(I_BuyFlowersDao buyFlowersDao) {
        this.buyFlowersDao = buyFlowersDao;
    }

    public BuyFlowersService() {
        setBaseDao(buyFlowersDao);
    }

    @Override
    public List<BuyFlowers> list() {
        String hql = "from BuyFlowers";
        return buyFlowersDao.list(hql);
    }
    @Override
    public void buy(){

    }
}
