package com.example.springdocker.service;

import com.example.springdocker.model.*;
import com.example.springdocker.model.Character;
import com.example.springdocker.repository.CharacterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CharacterService {

private final CharacterRepository repository;

    public List<Character> getCharacter() {
        return repository.findAll();
    }

    public void saveNewCharacter(Character character) {
        repository.save(character);
    }

    public Character getCharacterByName(String name) {
        return repository.findCharacterByName(name);
    }

    public List<Character> getCharactersByAge(int age) {
        return repository.findCharactersByAge(age);

    }

    public List<Character> getCharactersByGender(String gender) {
        return repository.findCharactersByGender(gender);
    }

    public List<Character> getCharactersBySpecies(Species species) {
        return repository.findCharactersBySpecies(species);
    }

    public List<Character> getCharactersByLevel(int level) {
        return repository.findCharactersByLevel(level);
    }

    public List<Character> getCharactersByMaxHealth(double maxHealth) {
        return repository.findCharactersByMaxHealth(maxHealth);
    }

    public List<Character> getCharactersByWeapon(Weapon weapon) {
        return repository.findCharactersByWeapon(weapon);
    }

    public List<Character> getCharactersByFavoriteFood(Food favoriteFood) {
        return repository.findCharactersByFavoriteFood(favoriteFood);
    }
}
