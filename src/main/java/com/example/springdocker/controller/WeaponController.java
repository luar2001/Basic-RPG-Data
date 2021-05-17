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

    @GetMapping("/weapon")
    public List<Weapon> getWeapon(){
        return service.getWeapon();
    }

    @PostMapping("/weapon")
    public void saveNewWeapon(@RequestBody Weapon weapon) {service.saveNewWeapon(weapon);}

    @GetMapping("/weapon/byname")
    public Weapon getWeaponByName(@RequestBody String name) {return service.getWeaponByName(name);}

    @GetMapping("/weapon/bytype")
    public List<Weapon> getWeaponByType(@RequestBody WeaponType type) {return service.getWeaponByType(type);}

    @GetMapping("/weapon/byattack")
    public List<Weapon> getWeaponByAttackValue(@RequestBody double attackValue) {return service.getWeaponByAttackValue(attackValue);}

}
