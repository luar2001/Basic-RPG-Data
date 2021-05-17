package com.example.springdocker.service;

import com.example.springdocker.model.Weapon;
import com.example.springdocker.model.WeaponType;
import com.example.springdocker.repository.WeaponRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class WeaponService {
    private final WeaponRepository repository;

    public List<Weapon> getWeapon() {
        return repository.findAll();
    }

    public void saveNewWeapon(Weapon weapon) {
        repository.save(weapon);
    }

    public Weapon getWeaponByName(String name) {
        return repository.findWeaponByName(name);
    }

    public List<Weapon> getWeaponByType(WeaponType type) {
        return repository.findWeaponByType(type);
    }

    public List<Weapon> getWeaponByAttackValue(double attackValue) {
        return repository.findWeaponByAttackValue(attackValue);
    }
}
