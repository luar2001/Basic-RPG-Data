package com.example.springdocker.repository;


import com.example.springdocker.model.Weapon;
import com.example.springdocker.model.WeaponType;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface WeaponRepository extends MongoRepository<Weapon , String> {
    List<Weapon> FindWeaponByType(WeaponType type);
    List<Weapon> FindWeaponByAttackValue(double attackValue);
    String FindWeaponByName(String name);
}
