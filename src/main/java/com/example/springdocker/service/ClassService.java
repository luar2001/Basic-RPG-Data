package com.example.springdocker.service;


import com.example.springdocker.model.Class;
import com.example.springdocker.repository.ClassRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ClassService {
    private final ClassRepository repository;

    public List<Class> getRPGClass() {
        return repository.findAll();
    }

    public void saveNewClass(Class rpgClass) {
        repository.save(rpgClass);
    }

    public Class getClassByName(String name) {
       return repository.FindClassByClassName(name);
    }
}
