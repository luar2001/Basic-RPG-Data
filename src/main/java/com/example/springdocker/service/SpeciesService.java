package com.example.springdocker.service;


import com.example.springdocker.model.Species;
import com.example.springdocker.repository.SpeciesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class SpeciesService {

    private final SpeciesRepository repository;

    public List<Species> getSpecies() {
        return repository.findAll();
    }

    public void saveNewSpecies(Species species) {
        repository.save(species);
    }

    public Species getSpeciesByName(String name) {
        return repository.FindSpeciesByName(name);
    }
}
