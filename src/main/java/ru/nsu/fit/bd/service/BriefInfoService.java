package ru.nsu.fit.bd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.fit.bd.Dao.BriefInfoDao;
import ru.nsu.fit.bd.model.BriefInfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BriefInfoService {
    @Autowired
    private BriefInfoDao briefInfoDao;

    public Map<String, Float> get(String UniversityName) throws Exception {
        Map<String, Float> res = new HashMap<>();
        List<BriefInfo> info = briefInfoDao.get(UniversityName);
        res.put("Impression", info.get(0).getImpression());
        res.put("Classes", info.get(0).getClasses());
        res.put("Dormitory", info.get(0).getDormitory());
        res.put("Infrastructure", info.get(0).getInfrastructure());
        res.put("Teachers", info.get(0).getTeachers());
        res.put("Scholarship", info.get(0).getScholarship());
        res.put("Pospects", info.get(0).getPospects());
        return res;
    }
}
