package com.example.appz.controllers;

import com.example.appz.models.MusicalInstrument;
import com.example.appz.service.MusicalInstrumentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@AllArgsConstructor
public class MusicalInstrumentController {
    private final MusicalInstrumentService service;
    @GetMapping(path = "/all")
    public @ResponseBody List<MusicalInstrument> all(){
        return service.findAll();
    }
}
