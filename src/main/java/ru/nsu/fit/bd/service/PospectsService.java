package ru.nsu.fit.bd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.fit.bd.Dao.PospectsDao;
import ru.nsu.fit.bd.model.Pospects;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PospectsService {
    @Autowired
    private PospectsDao pospectsDao;

    public Map<String, Float> get(String uniName) throws Exception {
        Map<String, Float> res = new HashMap<>();
        List<Pospects> info = pospectsDao.get(uniName);
        res.put("IssueYear", info.get(0).getIssueYear());
        res.put("StartSelary", info.get(0).getStartSelary());
        res.put("UsefullStuding", info.get(0).getUsefullStuding());
        res.put("Placement", info.get(0).getPlacement());
        return res;
    }
}
