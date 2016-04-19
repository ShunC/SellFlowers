package org.cs.Dao;

import org.cs.Model.Flowers;
import org.springframework.stereotype.Repository;

/**
 * Created by pc on 2016/4/19.
 */
@Repository("flowers")
public class FlowersDao extends BaseDao<Flowers> implements I_FlowersDao{
}
