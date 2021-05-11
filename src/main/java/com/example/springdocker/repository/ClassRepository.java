package com.example.springdocker.repository;

import com.example.springdocker.model.Class;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepository extends MongoRepository<Class, String> {
    Class FindClassByClassName(String className);
}
