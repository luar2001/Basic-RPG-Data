package com.example.springdocker.repository;


import com.example.springdocker.model.Weapon;
import com.example.springdocker.model.WeaponType;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WeaponRepository extends MongoRepository<Weapon , String> {
    List<Weapon> FindWeaponByType(WeaponType type);
    List<Weapon> FindWeaponByAttackValue(double attackValue);
    Weapon FindWeaponByName(String name);
}
