package org.cs.Dao;

import java.util.List;

/**
 * Created by pc on 2016/4/19.
 */
public interface I_BaseDao<T> {
    public void add(T t);
    public void update(T t);
    public void delete(String id);
    public T load(String id);
    public List<T> list(String hql , Object[] args);
    public List<T> list(String hql);
    public List<T> list(String hql,Object arg);
}
