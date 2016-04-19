package org.cs.Dao;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import javax.annotation.Resource;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by pc on 2016/4/19.
 */
public class BaseDao<T> implements I_BaseDao<T>{

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    @Resource(name = "sessionFactory")
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    /*
    * 创建 Class 来获取 泛型<T>
    * */
    private Class<T> clz;

    public Class<T> getClz(){
        if (clz == null){
            clz = ((Class<T>)
                    (((ParameterizedType)(this.getClass().getGenericSuperclass())).getActualTypeArguments()[0]));
        }
        return clz;
    }

    @Override
    public void add(T t) {
        this.getSessionFactory().getCurrentSession().save(t);
    }

    @Override
    public void update(T t) {
        this.getSessionFactory().getCurrentSession().update(t);
    }

    @Override
    public void delete(String id) {
        this.getSessionFactory().getCurrentSession().delete(id);
    }

    @Override
    public T load(String id) {
        return (T) this.getSessionFactory().getCurrentSession().load(getClz(),id);
    }

    @Override
    public List<T> list(String hql, Object[] args) {
        Query query = getSessionFactory().getCurrentSession().createQuery(hql);
        if (args != null){
            for (int i = 0; i < args.length ; i++){
                query.setParameter(i , args[i]);
            }
        }
        List<T> list = query.list();
        return list;
    }

    @Override
    public List<T> list(String hql) {
        return list(hql,null);
    }

    @Override
    public List<T> list(String hql, Object arg) {
        return list(hql,new Object[]{arg});
    }
}
