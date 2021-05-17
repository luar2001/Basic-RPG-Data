package com.example.springdocker.controller;

import com.example.springdocker.model.Food;
import com.example.springdocker.repository.SpeciesRepository;
import com.example.springdocker.service.SpeciesService;
import com.example.springdocker.model.Species;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class SpeciesController {

    private final SpeciesService service;

    @GetMapping("/species")
    public List<Species> getSpecies() {
        return service.getSpecies();
    }

    @PostMapping("/species")
    public void saveNewSpecies(@RequestBody Species species) {
        service.saveNewSpecies(species);
    }

    @GetMapping("/specieses")
    public Species getSpeciesBySpecies(@RequestBody String species) {
        return service.getSpeciesBySpecies(species);
    }


    // http://localhost:8081/species?
    //http://localhost:8081/specieses?

}
