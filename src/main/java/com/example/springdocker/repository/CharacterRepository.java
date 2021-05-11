package com.example.springdocker.repository;

import com.example.springdocker.model.*;
import com.example.springdocker.model.Character;
import com.example.springdocker.model.Class;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CharacterRepository extends MongoRepository<Character , String>{
    Character FindCharacterByName(String name);
    List<Character> FindCharactersByAge(int age);
    List<Character> FindCharactersByGender(String gender);
    List<Character> FindCharactersBySpecies(Species species);
    List<Character> FindCharactersByLevel(int level);
    List<Character> FindCharactersByClass(Class rpgClass);
    List<Character> FindCharactersByMaxHealth(double max_health);
    List<Character> FindCharactersByWeapon(Weapon weapon);
    List<Character> FindCharactersByFavoriteFood(Food favoriteFood);

}
