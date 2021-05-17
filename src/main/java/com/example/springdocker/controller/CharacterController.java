package com.example.springdocker.controller;

import com.example.springdocker.model.*;
import com.example.springdocker.model.Character;
import com.example.springdocker.service.CharacterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class CharacterController {
    private CharacterService service;

    @GetMapping("/character")
    public List<Character> getCharacter() {
        return service.getCharacter();
    }

    @PostMapping("/character")
    public void saveNewClass(@RequestBody Character character) {
        service.saveNewCharacter(character);
    }

    @GetMapping("/byname")
    public Character getCharacterByName(@RequestBody String name) {
        return service.getCharacterByName(name);
    }

    @GetMapping("/byage")
    public List<Character> getCharacterByAge(@RequestBody int age) {
        return service.getCharactersByAge(age);
    }

    @GetMapping("/bygender")
    public List<Character> getCharacterByGender(@RequestBody String gender) {
        return service.getCharactersByGender(gender);
    }

    @GetMapping("/byspecies")
    public List<Character> getCharacterBySpecies(@RequestBody Species species) {
        return service.getCharactersBySpecies(species);
    }

    @GetMapping("/bylevel")
    public List<Character> getCharacterByLevel(@RequestBody int level) {
        return service.getCharactersByLevel(level);
    }

    @GetMapping("/maxhealth")
    public List<Character> getCharacterByMaxHealth(@RequestBody double maxHealth) {
        return service.getCharactersByMaxHealth(maxHealth);
    }

    @GetMapping("/byweapon")
    public List<Character> getCharacterByWeapon(@RequestBody Weapon weapon) {
        return service.getCharactersByWeapon(weapon);
    }

    @GetMapping("/byfavfood")
    public List<Character> getCharacterByFavoriteFood(@RequestBody Food favoriteFood) {
        return service.getCharactersByFavoriteFood(favoriteFood);
    }


}
