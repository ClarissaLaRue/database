package ru.nsu.fit.bd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.nsu.fit.bd.service.ScholarshipService;

@RestController
@RequestMapping("/scholarship")
public class ScholarshipController {
    @Autowired
    private ScholarshipService scholarshipService;
}
