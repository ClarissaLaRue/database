package ru.nsu.fit.bd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.nsu.fit.bd.model.Faculties;
import ru.nsu.fit.bd.service.FacultiesService;
import ru.nsu.fit.bd.model.Universities;
import java.util.List;

@RestController
@RequestMapping("/faculties")
public class FacultiesController {
    @Autowired
    private FacultiesService facultiesService;

    @GetMapping("/{UniName}")
    public List<String> get(@PathVariable String UniName) throws Exception {
        return facultiesService.get(UniName);
    }

//    @GetMapping("/nsu")
//    public List<Faculties> get() throws Exception {
//        Integer UniID = 1;
//        //return facultiesService.get(UniID);
//    }
}
