package ru.nsu.fit.bd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.fit.bd.Dao.InfrastructureDao;
import ru.nsu.fit.bd.model.Infrastructure;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class InfrastructureService {
    @Autowired
    private InfrastructureDao infrastructureDao;

    public List<Infrastructure> get(String uniName) throws Exception {
        return infrastructureDao.get(uniName);
    }
}
