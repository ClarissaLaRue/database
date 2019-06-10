package ru.nsu.fit.bd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.nsu.fit.bd.model.DetailedInfo;
import ru.nsu.fit.bd.service.DetailedInfoService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/detailedinfo")
public class DetailedInfoController {
    @Autowired
    private DetailedInfoService detailedInfoService;

    @GetMapping("/{UniName}")
    public List<DetailedInfo> get(@PathVariable String UniName) throws Exception {
        return detailedInfoService.get(UniName);
    }
}
