package com.example.springdocker.repository;

import com.example.springdocker.model.Species;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpeciesRepository extends MongoRepository<Species, String> {
    Species findSpeciesBySpecies(String species);
}
