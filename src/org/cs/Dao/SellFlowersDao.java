package org.cs.Dao;

import org.cs.Model.SellFlowers;
import org.springframework.stereotype.Repository;

/**
 * Created by pc on 2016/4/19.
 */
@Repository("sellFlowers")
public class SellFlowersDao extends BaseDao<SellFlowers> implements I_SellFlowersDao{
}
