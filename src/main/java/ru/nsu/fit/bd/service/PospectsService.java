package ru.nsu.fit.bd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.fit.bd.Dao.PospectsDao;

@Service
public class PospectsService {
    @Autowired
    private PospectsDao pospectsDao;
}
