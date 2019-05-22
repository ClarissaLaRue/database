package ru.nsu.fit.bd;

import javax.persistence.Entity;
import java.util.List;

public interface InterfaceDao<T> {
    public T getByPK(T obj) throws Exception;

    public void update(T obj) throws Exception;

    public void delete(T obj) throws Exception;

    public List<T> getAll() throws Exception;

    public T create(T obj) throws Exception;
}
