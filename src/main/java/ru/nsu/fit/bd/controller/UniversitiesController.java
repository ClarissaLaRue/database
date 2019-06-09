package ru.nsu.fit.bd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.nsu.fit.bd.model.Universities;
import ru.nsu.fit.bd.service.UniversitiesService;

import java.net.URL;
import java.util.List;

@RestController
@RequestMapping("/universities")
public class UniversitiesController {
    @Autowired
    private UniversitiesService universitiesService;

    @GetMapping("/all")
    public List<Universities> getAllUni() throws Exception {
        return universitiesService.getAll();
    }
}
