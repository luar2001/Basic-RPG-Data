package com.example.springdocker.service;

import com.example.springdocker.model.WeaponType;
import com.example.springdocker.repository.WeaponTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class WeaponTypeService {

    private final WeaponTypeRepository repository;

    public List<WeaponType> getWeaponTypes() {
        return repository.findAll();
    }

    public WeaponType getWeaponTypesByType(String type) {
        return repository.findWeaponTypeByType(type);
    }

    public void saveNewWeaponType(WeaponType weaponType) {
        repository.save(weaponType);
    }
}
