package ru.nsu.fit.bd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.fit.bd.Dao.TeachersDao;
import ru.nsu.fit.bd.model.Teachers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TeachersService {
    @Autowired
    private TeachersDao teachersDao;

    public Map<String, Float> get(String uniName) throws Exception {
        Map<String, Float> res = new HashMap<>();
        List<Teachers> info = teachersDao.get(uniName);
        res.put("Seminarians", info.get(0).getSeminarians());
        res.put("Lecturers", info.get(0).getLecturers());
        return res;
    }
}
