package ru.nsu.fit.bd;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.List;

public interface InterfaceDao<T, PK> {
    public List<T>  get(PK obj) throws Exception;

    public void update(T obj) throws Exception;

    public void delete(T obj) throws Exception;

    public List<T> getAll() throws Exception;

    public T create(T obj) throws Exception;
}
