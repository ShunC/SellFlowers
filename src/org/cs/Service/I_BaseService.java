package org.cs.Service;

import java.util.List;

/**
 * Created by pc on 2016/4/19.
 */
public interface I_BaseService<T> {
    public void add(T t);
    public void update(T t);
    public void delete(String id);
    public T load(String id);
    public List<T> list();
}
