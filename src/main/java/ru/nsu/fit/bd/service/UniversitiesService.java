package ru.nsu.fit.bd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.fit.bd.UniversitiesDao;
import ru.nsu.fit.bd.model.Universities;

import java.util.List;

@Service
public class UniversitiesService {
    @Autowired
    private UniversitiesDao universitiesDao;

    public Universities getByPK(Universities obj) throws Exception {
        return universitiesDao.getByPK(obj );
    }

    public void update(Universities obj) throws Exception {
        universitiesDao.update( obj );
    }

    public void delete(Universities obj) throws Exception {
        universitiesDao.delete( obj );
    }

    public Universities create(Universities obj) throws Exception {
        return universitiesDao.create( obj );
    }

    public List<Universities> getAll() throws Exception {
        return universitiesDao.getAll();
    }
}
