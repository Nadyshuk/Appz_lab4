package com.example.appz.service;

import com.example.appz.models.MusicalInstrument;
import com.example.appz.repo.MusicalInstrumentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MusicalInstrumentService {
    private final MusicalInstrumentRepository repository;

    public List<MusicalInstrument> findAll(){
        return  repository.findAll();
    }
}

