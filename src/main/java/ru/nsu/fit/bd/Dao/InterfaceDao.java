package ru.nsu.fit.bd.Dao;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.List;

public interface InterfaceDao<T, PK> {
    public List<T>  get(PK obj) throws Exception;

    public List<T> getAll() throws Exception;
}
