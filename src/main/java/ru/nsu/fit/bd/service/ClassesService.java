package ru.nsu.fit.bd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.fit.bd.Dao.ClassesDao;
import ru.nsu.fit.bd.model.Classes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ClassesService {
    @Autowired
    private ClassesDao classesDao;

    public Map<String, Float> get(String uniName) throws Exception {
        Map<String, Float> res = new HashMap<>();
        List<Classes> info = classesDao.get(uniName);
        res.put("Profile", info.get(0).getProfile());
        res.put("NonProfile", info.get(0).getNonProfile());
        return res;
    }
}
