package ru.nsu.fit.bd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.nsu.fit.bd.model.Scholarship;
import ru.nsu.fit.bd.service.ScholarshipService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/scholarship")
public class ScholarshipController {
    @Autowired
    private ScholarshipService scholarshipService;

    @GetMapping("/{UniName}")
    public List<Scholarship> get(@PathVariable String UniName) throws Exception {
        return scholarshipService.get(UniName);
    }
}
