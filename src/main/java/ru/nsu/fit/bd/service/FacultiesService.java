package ru.nsu.fit.bd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.fit.bd.FacultiesDao;
import ru.nsu.fit.bd.model.Faculties;

import java.util.List;

@Service
public class FacultiesService{
    @Autowired
    private FacultiesDao facultiesDao;

    public List<Faculties> get(Integer UniversityID) throws Exception {
        return facultiesDao.get(UniversityID);
    }
}
