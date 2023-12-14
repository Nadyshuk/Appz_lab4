package com.example.appz.repo;

import com.example.appz.models.MusicalInstrument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MusicalInstrumentRepository extends JpaRepository<MusicalInstrument, Integer> {
    List<MusicalInstrument> findAll();
}
