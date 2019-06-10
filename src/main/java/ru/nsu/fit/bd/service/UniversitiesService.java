package ru.nsu.fit.bd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.fit.bd.Dao.UniversitiesDao;
import ru.nsu.fit.bd.model.Universities;

import java.util.List;

@Service
public class UniversitiesService {
    @Autowired
    private UniversitiesDao universitiesDao;

    public List<Universities> getAll() throws Exception {
        return universitiesDao.getAll();
    }
}
