package org.cs.Service;

import org.cs.Dao.I_FlowersDao;
import org.cs.Model.BuyFlowers;
import org.cs.Model.Flowers;
import org.cs.Model.SellFlowers;
import org.cs.Model.User;

import java.util.List;

/**
 * Created by pc on 2016/4/19.
 */
public interface I_OrderService {
    public void requestOrder();
    public void newOrder();
    public void cancelOrder();
    public void updateOrder();

}
