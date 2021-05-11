package com.example.springdocker.controller;

import com.example.springdocker.model.WeaponType;
import com.example.springdocker.service.WeaponTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class WeaponTypeController {
    private final WeaponTypeService service;

    @GetMapping("/weapontype")
    public List<WeaponType> getWeaponTypes(){return service.getWeaponTypes();}

    @PostMapping("/class")
    public void saveNewWeaponType(@RequestBody WeaponType weaponType) {service.saveNewWeaponType(weaponType);}

    @GetMapping("/weapontype")
    public WeaponType getWeaponTypesByType(@RequestBody String type) {return service.getWeaponTypesByType(type);}


}
