package ru.nsu.fit.bd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.fit.bd.Dao.TeachersDao;

@Service
public class TeachersService {
    @Autowired
    private TeachersDao teachersDao;
}
