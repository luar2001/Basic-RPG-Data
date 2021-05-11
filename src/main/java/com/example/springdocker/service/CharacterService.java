package com.example.springdocker.service;

import com.example.springdocker.model.*;
import com.example.springdocker.model.Character;
import com.example.springdocker.model.Class;
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
        return repository.FindCharacterByName(name);
    }

    public List<Character> getCharacterByAge(int age) {
        return repository.FindCharactersByAge(age);

    }

    public List<Character> getCharacterByGender(String gender) {
        return repository.FindCharactersByGender(gender);
    }

    public List<Character> getCharacterBySpecies(Species species) {
        return repository.FindCharactersBySpecies(species);
    }

    public List<Character> getCharacterByLevel(int level) {
        return repository.FindCharactersByLevel(level);
    }

    public List<Character> getCharacterByClass(Class rpgClass) {
        return repository.FindCharactersByClass(rpgClass);
    }

    public List<Character> getCharacterByMaxHealth(double maxHealth) {
        return repository.FindCharactersByMaxHealth(maxHealth);
    }

    public List<Character> getCharacterByWeapon(Weapon weapon) {
        return repository.FindCharactersByWeapon(weapon);
    }

    public List<Character> getCharacterByFavoriteFood(Food favoriteFood) {
        return repository.FindCharactersByFavoriteFood(favoriteFood);
    }
}
