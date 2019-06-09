package ru.nsu.fit.bd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.fit.bd.FacultiesDao;
import ru.nsu.fit.bd.model.Faculties;

import java.util.ArrayList;
import java.util.List;

@Service
public class FacultiesService{
    @Autowired
    private FacultiesDao facultiesDao;

    public List<String> get(String UniversityName) throws Exception {
        List<Faculties> Fac = facultiesDao.get(UniversityName);
        List<String> names = new ArrayList<>();
        for(int i = 0; i < Fac.size(); i++){
            names.add(Fac.get(i).getName());
        }
        return names;
    }
}
