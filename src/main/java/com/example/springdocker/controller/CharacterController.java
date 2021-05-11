package com.example.springdocker.controller;

import com.example.springdocker.model.*;
import com.example.springdocker.model.Character;
import com.example.springdocker.model.Class;
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
    public List<Character> getCharacter(){
        return service.getCharacter();
    }

    @PostMapping("/character")
    public void saveNewClass(@RequestBody Character character) {service.saveNewCharacter(character);}

    @GetMapping("/character")
    public Character getCharacterByName(@RequestBody String name) {return service.getCharacterByName(name);}

    @GetMapping("/character")
    public List<Character> getCharacterByAge(@RequestBody int age) {return service.getCharacterByAge(age);}

    @GetMapping("/character")
    public List<Character> getCharacterByGender(@RequestBody String gender) {return service.getCharacterByGender(gender);}

    @GetMapping("/character")
    public List<Character> getCharacterBySpecies(@RequestBody Species species) {return service.getCharacterBySpecies(species);}

    @GetMapping("/character")
    public List<Character> getCharacterByLevel(@RequestBody int level) {return service.getCharacterByLevel(level);}

    @GetMapping("/character")
    public List<Character> getCharacterByClass(@RequestBody Class rpgClass) {return service.getCharacterByClass(rpgClass);}

    @GetMapping("/character")
    public List<Character> getCharacterByMaxHealth(@RequestBody double maxHealth) {return service.getCharacterByMaxHealth(maxHealth);}

    @GetMapping("/character")
    public List<Character> getCharacterByWeapon(@RequestBody Weapon weapon) {return service.getCharacterByWeapon(weapon);}

    @GetMapping("/character")
    public List<Character> getCharacterByFavoriteFood(@RequestBody Food favoriteFood) {return service.getCharacterByFavoriteFood(favoriteFood);}





}
