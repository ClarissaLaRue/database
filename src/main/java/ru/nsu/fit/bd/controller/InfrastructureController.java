package ru.nsu.fit.bd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.nsu.fit.bd.model.Infrastructure;
import ru.nsu.fit.bd.service.InfrastructureService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/infrastructure")
public class InfrastructureController {
    @Autowired
    private InfrastructureService infrastructureService;

    @GetMapping("/{UniName}")
    public List<Infrastructure> get(@PathVariable String UniName) throws Exception {
        return infrastructureService.get(UniName);
    }
}
