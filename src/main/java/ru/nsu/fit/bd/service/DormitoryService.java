package ru.nsu.fit.bd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.fit.bd.Dao.DormitoryDao;
import ru.nsu.fit.bd.model.Dormitory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DormitoryService {
    @Autowired
    private DormitoryDao dormitoryDao;

    public Map<String, Float> get(String uniName) throws Exception {
        Map<String, Float> res = new HashMap<>();
        List<Dormitory> info = dormitoryDao.get(uniName);
        res.put("State", info.get(0).getState());
        res.put("Shower", info.get(0).getShower());
        res.put("Kitchen", info.get(0).getKitchen());
        res.put("PersonsCount", info.get(0).getPersonsCount());
        res.put("Price", info.get(0).getPrice());
        return res;
    }
}
