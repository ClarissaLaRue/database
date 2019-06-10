package ru.nsu.fit.bd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.fit.bd.Dao.ScholarshipDao;
import ru.nsu.fit.bd.model.Scholarship;

import java.util.List;
import java.util.Map;

@Service
public class ScholarshipService {
    @Autowired
    private ScholarshipDao scholarshipDao;

    public List<Scholarship> get(String uniName) throws Exception {
        return scholarshipDao.get(uniName);
    }
}
