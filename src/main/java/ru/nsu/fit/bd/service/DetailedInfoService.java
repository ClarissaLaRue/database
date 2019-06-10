package ru.nsu.fit.bd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.fit.bd.Dao.DetailedInfoDao;
import ru.nsu.fit.bd.model.DetailedInfo;

import java.util.List;

@Service
public class DetailedInfoService {
    @Autowired
    private DetailedInfoDao detailedInfoDao;

    public List<DetailedInfo> get(String uniName) throws Exception {
        return detailedInfoDao.get(uniName);
    }
}
