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

    @DeleteMapping
    public void deleteRoom(String name, URL link) throws Exception {
        universitiesService.delete( new Universities( name, link ) );
    }

    @PutMapping
    public void updateRoom(String name, URL link, @RequestBody Universities uni) throws Exception {
        uni = new Universities( name, link );
        universitiesService.update( uni );
    }

    @PostMapping
    public Universities createRoom(@RequestBody Universities uni) throws Exception {
        uni = universitiesService.create( uni );
        return uni;
    }
}
