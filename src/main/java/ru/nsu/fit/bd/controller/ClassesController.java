package ru.nsu.fit.bd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.nsu.fit.bd.service.ClassesService;

import java.util.Map;

@RestController
@RequestMapping("/classes")
public class ClassesController {
    @Autowired
    private ClassesService classesService;

    @GetMapping("/{UniName}")
    public Map<String, Float> get(@PathVariable String UniName) throws Exception {
        return classesService.get(UniName);
    }
}
