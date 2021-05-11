package com.example.springdocker.controller;

import com.example.springdocker.model.WeaponType;
import com.example.springdocker.service.WeaponService;
import com.example.springdocker.model.Weapon;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class WeaponController {
    private final WeaponService service;

    @GetMapping("/Weapon")
    public List<Weapon> getWeapon(){
        return service.getWeapon();
    }

    @PostMapping("/Weapon")
    public void saveNewWeapon(@RequestBody Weapon weapon) {service.saveNewWeapon(weapon);}

    @GetMapping("/Weapon")
    public Weapon getWeaponByName(@RequestBody String name) {return service.getWeaponByName(name);}

    @GetMapping("/Weapon")
    public List<Weapon> getWeaponByType(@RequestBody WeaponType type) {return service.getWeaponByType(type);}

    @GetMapping("/Weapon")
    public List<Weapon> getWeaponByAttackValue(@RequestBody double attackValue) {return service.getWeaponByAttackValue(attackValue);}

}
