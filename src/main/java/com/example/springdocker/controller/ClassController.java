package com.example.springdocker.controller;

import com.example.springdocker.service.ClassService;
import com.example.springdocker.model.Class;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ClassController {
    private final ClassService service;

    @GetMapping("/class")
    public List<Class> getRPGClass(){
        return service.getRPGClass();
    }

    @PostMapping("/class")
    public void saveNewClass(@RequestBody Class rpgClass) {service.saveNewClass(rpgClass);}

    @GetMapping("/class")
    public Class getClassByName(@RequestBody String name) {return service.getClassByName(name);}

}
