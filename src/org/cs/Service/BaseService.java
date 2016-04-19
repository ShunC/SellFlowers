package org.cs.Service;

import org.cs.Dao.I_BaseDao;
import org.hibernate.Session;

import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by pc on 2016/4/19.
 */
public class BaseService<T> implements I_BaseService<T> {

    protected ThreadLocal<Session> sessionThreadLocal = new ThreadLocal<Session>();

    private I_BaseDao<T> baseDao;

    public I_BaseDao<T> getBaseDao() {
        return baseDao;
    }

    public void setBaseDao(I_BaseDao<T> baseDao) {
        this.baseDao = baseDao;
    }

    @Override
    public void add(T t) {
        baseDao.add(t);
    }

    @Override
    public void update(T t) {
        baseDao.update(t);
    }

    @Override
    public void delete(String id) {
        baseDao.delete(id);
    }

    @Override
    public T load(String id) {
        return baseDao.load(id);
    }

    @Override
    public List<T> list() {
        return null;
    }
}
