package com.example.springdocker.repository;

import com.example.springdocker.model.WeaponType;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeaponTypeRepository extends MongoRepository <WeaponType, String>{
    WeaponType FindWeaponTypeByType(String type);
}
