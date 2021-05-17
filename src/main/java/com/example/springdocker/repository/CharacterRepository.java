package com.example.springdocker.repository;

import com.example.springdocker.model.*;
import com.example.springdocker.model.Character;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CharacterRepository extends MongoRepository<Character, String> {
    Character findCharacterByName(String name);

    List<Character> findCharactersByAge(int age);

    List<Character> findCharactersByGender(String gender);

    List<Character> findCharactersBySpecies(Species species);

    List<Character> findCharactersByLevel(int level);

    List<Character> findCharactersByMaxHealth(double maxHealth);

    List<Character> findCharactersByWeapon(Weapon weapon);

    List<Character> findCharactersByFavoriteFood(Food favoriteFood);

}
